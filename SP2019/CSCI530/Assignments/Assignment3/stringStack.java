import java.util.ArrayList;

public class stringStack {

    public static void buildStack(ArrayList<String> goString) {
        csvParseReader cpr = new csvParseReader();
        cpr.csvParseRead();
        String initStack = "0";
        String nextAct = "";
        String stripLead = "";
        for (int gi = 0; gi < goString.size(); gi++) {
            if (initStack.contains(cpr.returnList().get(0).getState())) {
                if (goString.get(gi).contains("id")) {
                    nextAct = cpr.returnList().get(0).getAction1();
                    goString.remove(gi);
                } else if (goString.get(gi).contains("+")) {
                    nextAct = cpr.returnList().get(0).getAction2();
                    goString.remove(gi);
                } else if (goString.get(gi).equals("-")) {
                    nextAct = cpr.returnList().get(0).getAction3();
                    goString.remove(gi);
                } else if (goString.get(gi).equals("(")) {
                    nextAct = cpr.returnList().get(0).getAction4();
                    goString.remove(gi);
                } else if (goString.get(gi).equals(")")) {
                    nextAct = cpr.returnList().get(0).getAction4();
                    goString.remove(gi);
                } else if (goString.get(gi).equals("$")) {
                    nextAct = cpr.returnList().get(0).getAction6();
                    goString.remove(gi);
                } else {
                }
            } else {
                System.out.println("Neither");
            }
        System.out.println("Next Action: " + nextAct);

        }
    }

}