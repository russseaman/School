import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class csvReader {
    // Using for potential future improvements....adding/changing table.

    BufferedReader br = null;
    String csvFile = "C:\\Users\\russ_\\Documents\\Git\SCHOOL\\SP2019\\CSCI530\\Assignments\\testbed\\src\\parseTable.csv";

    public List<tableParse> csvRead() {
        try {
            br = new BufferedReader(new FileReader(csvFile));
            List<tableParse> csvList = new ArrayList<>();

            String line = "";
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] rowValues = line.split(",");
                if (rowValues.length > 0) {
                    tableParse tp = new tableParse(Integer.parseInt(rowValues[0]), rowValues[1], rowValues[2],
                            rowValues[3], rowValues[4], rowValues[5], rowValues[6], Integer.parseInt(rowValues[7]),
                            Integer.parseInt(rowValues[8]), Integer.parseInt(rowValues[9]));
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
        // return null;
        return null;
    }

    public void printTable() {
        List<tableParse> csvList = csvRead();
        System.out.println("State \t| id\t|");
        for (int i = 0; i < csvList.size();i++) {
            // System.out.println("STATE \t| " + tp.getState());
            // System.out.println("id \t| " + tp.getAction1());
            // System.out.println("+ \t| "+ tp.getAction2());
            // System.out.println("* \t| "+ tp.getAction3());
            // System.out.println("( \t| "+ tp.getAction4());
            // System.out.println(") \t| "+ tp.getAction5());
            // System.out.println("$ \t| "+ tp.getAction6());
            // System.out.println("GOTO \t| " + tp.setGotoE());
            // System.out.println("GOTO \t| " + tp.setGotoT());
            // System.out.println("GOTO \t| " + tp.setGotoF());
            System.out.println(csvList.get(i).getState());
        }

    }

}
