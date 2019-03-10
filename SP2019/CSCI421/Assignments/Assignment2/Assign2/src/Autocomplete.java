import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import javax.swing.*;
import java.lang.NullPointerException;
import java.util.Arrays;

public class Autocomplete {

    private Term[] arrayTerms;

    public Autocomplete(Term[] terms) {
        this.arrayTerms = terms;
        Arrays.sort(arrayTerms); // orders the array of terms
    }

    public Term[] allMatches(String prefix) {
        if (prefix == null) {
            throw new NullPointerException();
        }

        Term temp = new Term(prefix, 0);

        int begin = BinarySearchDeluxe.firstIndexOf(arrayTerms, temp, Term.byPrefixOrder(prefix.length()));
        int end = BinarySearchDeluxe.lastIndexOf(arrayTerms, temp, Term.byPrefixOrder(prefix.length()));

        Term[] matches;
        matches = Arrays.copyOfRange(arrayTerms, begin, end);
        Arrays.sort(matches, Term.byReverseWeightOrder());
        return matches;
    }

    public static void main(String[] args) {
        String filename = "wiktionary.txt";
        In in = new In(filename);
        int N = in.readInt();
        Term[] terms = new Term[N];

        for (int i = 0; i < N; i++) {
            double weight = in.readDouble(); // read the next weight
            in.readChar(); // scan past the tab
            String query = in.readLine(); // read the next query
            terms[i] = new Term(query, weight); // construct the term
        }

        // read in queries from standard input and print out the top k matching terms
        int k = Integer.parseInt("10");
        Autocomplete autocomplete = new Autocomplete(terms);
        while (StdIn.hasNextLine()) {
            String prefix = StdIn.readLine();
            Term[] results = autocomplete.allMatches(prefix);
            for (int i = 0; i < Math.min(k, results.length); i++)
                StdOut.println(results[i]);
        }
    }
}
