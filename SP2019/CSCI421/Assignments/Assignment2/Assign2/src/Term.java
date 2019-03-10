import java.util.Comparator;
import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;

public class Term implements Comparable<Term> {

    private String query;
    private double weight;

    public Term(String query, double weight) {
        if (query == null)
            throw new NullPointerException("Your query cannot be null");
        if (weight < 0)
            throw new IllegalArgumentException("Weight cannot be negative");
        this.query = query;
        this.weight = weight;
    }

    public static Comparator<Term> byReverseWeightOrder() {
        return (Comparator<Term>) (term1, term2) -> {
            if (term1.weight > term2.weight)
                return -1;
            if (term1.weight == term2.weight)
                return 0;
            else
                return 1;
        };
    }

    public static Comparator<Term> byPrefixOrder(final int r) {
        return new Comparator<Term>() {
            @Override
            public int compare(Term term1, Term term2) {
                // the length of term1 and term2 must be less then r or be made length of r
                if (term1.query.length() < r && term2.query.length() < r)
                    return term1.query.compareTo(term2.query);
                else if (term1.query.length() < r)
                    return term1.query.compareTo(term2.query.substring(0, r));
                else if (term2.query.length() < r)
                    return term1.query.substring(0, r).compareTo(term2.query);
                else
                    return term1.query.substring(0, r).compareTo(term2.query.substring(0, r));
            }
        };
    }

    public int compareTo(Term that) {
        String currQuery = this.query;
        String prevQuery = that.query;
        return currQuery.compareTo(prevQuery);
    }

    public String toString() {
        return String.format("%.2f\t%s", this.weight, this.query);
    }
}
