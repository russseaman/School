import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class csvParseReader {
    // Using for potential future improvements....adding/changing table.
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    BufferedReader br = null;
    String csvFile = "CSCI530\\Assignments\\Assignment3\\parseTable.csv";

    public List<tableParse> csvParseRead() {
        try {
            br = new BufferedReader(new FileReader(csvFile));
            List<tableParse> csvList = new ArrayList<>();

            String line = "";
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] rowValues = line.split(",",-1);
                if (rowValues.length > 0) {
                    tableParse tp = new tableParse(Integer.parseInt(rowValues[0]), rowValues[1], rowValues[2],
                            rowValues[3], rowValues[4], rowValues[5], rowValues[6], rowValues[7],
                            rowValues[8], rowValues[9]);
                    csvList.add(tp);
                }
            }
            return csvList;

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
        List<tableParse> csvList = csvParseRead();
        String Header = "State \t| id \t| + \t| * \t| ( \t| ) \t| $ \t| E \t| T \t| F \t|";
        System.out.println(ANSI_YELLOW_BACKGROUND + Header);
        for (int i = 0; i < csvList.size(); i++) {
            System.out.println(csvList.get(i).getState() + "\t| " + csvList.get(i).getAction1() + "\t| "
                    + csvList.get(i).getAction2() + "\t| " + csvList.get(i).getAction3() + "\t| "
                    + csvList.get(i).getAction4() + "\t| " + csvList.get(i).getAction5() + "\t| "
                    + csvList.get(i).getAction6() + "\t| " + csvList.get(i).getGotoE() + "\t| "
                    + csvList.get(i).getGotoT() + "\t| " + csvList.get(i).getGotoF() + "\t|");
        }

    }

}