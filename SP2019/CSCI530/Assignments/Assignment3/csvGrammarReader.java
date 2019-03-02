import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class csvGrammarReader {
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    BufferedReader br = null;
    String csvFile = "grammar.csv";

    public List<grammarParse> csvGrammarRead() {
        try {
            br = new BufferedReader(new FileReader(csvFile));
            List<grammarParse> csvGramList = new ArrayList<>();

            String line = "";
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] rowValues = line.split(",", -1);
                if (rowValues.length > 0) {
                    grammarParse gp = new grammarParse(rowValues[0], rowValues[1], rowValues[2], rowValues[3],
                            rowValues[4]);
                    csvGramList.add(gp);
                }
            }
            return csvGramList;
        } catch (Exception ee) {
            ee.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException ie) {
                System.out.println("Error closing buffered reader");
                ie.printStackTrace();
            }
        }
        return null;
    }

    public void printTable() throws InterruptedException {
        List<grammarParse> csvGramList = csvGrammarRead();
        System.out.println("Grammar Rules:");
        for (int i = 0; i < csvGramList.size(); i++)
            System.out.println(csvGramList.get(i).getG1() + csvGramList.get(i).getG2() + csvGramList.get(i).getG3()
                    + csvGramList.get(i).getG4() + csvGramList.get(i).getG5());
    }

}