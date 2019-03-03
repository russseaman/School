import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class csvParseReader {
    // Using for potential future improvements....adding/changing table.
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    BufferedReader br = null;
    String csvFile = "parseTable.csv";

    public List<tableParse> csvParseRead() {
        try {
            br = new BufferedReader(new FileReader(csvFile));
            List<tableParse> csvList = new ArrayList<>();

            String line = "";
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] rowValues = line.split(",", -1);
                if (rowValues.length > 0) {
                    tableParse tp = new tableParse(rowValues[0], rowValues[1], rowValues[2], rowValues[3], rowValues[4],
                            rowValues[5], rowValues[6], rowValues[7], rowValues[8], rowValues[9]);
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
        // return csvList;
        return null;
    }

    public List<tableParse> returnList() {
        List<tableParse> csvList = csvParseRead();
        return csvList;
    }

    public void printTable() throws InterruptedException {
        List<tableParse> csvList = csvParseRead();
        // System.out.println(ANSI_YELLOW_BACKGROUND + Header);
        System.out.println("Parse Table: ");
        StringBuilder spb = new StringBuilder();
        spb.append(String.format(
                "+------------+---------+---------+---------+--------+---------+---------+---------+---------+---------+%n"));
        String printFormat = "| %-10s | %-7s | %-7s | %-7s | %-7s| %-7s | %-7s | %-7s | %-7s | %-7s |%n";
        spb.append(String.format(printFormat, "State", "id", "+", "*", "(", ")", "$", "E", "T", "F"));
        spb.append(String.format(
                "+------------+---------+---------+---------+--------+---------+---------+---------+---------+---------+%n"));
        for (int i = 0; i < csvList.size(); i++)
            spb.append(String.format(printFormat, csvList.get(i).getState(), csvList.get(i).getAction1(),
                    csvList.get(i).getAction2(), csvList.get(i).getAction3(), csvList.get(i).getAction4(),
                    csvList.get(i).getAction5(), csvList.get(i).getAction6(), csvList.get(i).getGotoE(),
                    csvList.get(i).getGotoT(), csvList.get(i).getGotoF()));
        spb.append(String.format(
                "+------------+---------+---------+---------+--------+---------+---------+---------+---------+---------+%n"));
        for (int i = 0; i < 109; i++) {
            System.out.print("-");
        }
        System.out.print("\n" + spb.toString());
    }

}