import java.util.ArrayList;

public class stringStack {

    public static void buildStack(ArrayList<String> goString) {
        csvParseReader cpr = new csvParseReader();
        cpr.csvParseRead();
        String initStack = "0";
        String nextAct = "";
        int currState = 0;
        String nextActSub = "";
        int specialMove = 0;

        for (int gi = goString.size() - 1; gi > 0; gi--) {
            String currItem = "";
            if (initStack.contains(cpr.returnList().get(currState).getState()) || specialMove == 1) {
                System.out.println(initStack);
                if (goString.get(0).equals("id")) {
                    nextAct = cpr.returnList().get(currState).getAction1();
                    initStack = initStack.concat(goString.remove(0).toString());
                    currItem = "id";
                } else if (goString.get(0).equals("+")) {
                    nextAct = cpr.returnList().get(currState).getAction2();
                    initStack = initStack.concat(goString.remove(0).toString());
                    nextActSub = nextAct.substring(1);
                    initStack = initStack.concat(nextActSub);
                } else if (goString.get(0).equals("*")) {
                    nextAct = cpr.returnList().get(currState).getAction3();
                    initStack = initStack.concat(goString.remove(0).toString());
                    nextActSub = nextAct.substring(1);
                    initStack = initStack.concat(nextActSub);
                    System.out.println(initStack);
                    currItem = "*";
 
                    // System.out.println(initStack);
                } else if (goString.get(0).equals("(")) {
                    initStack = initStack.concat(goString.remove(0).toString());
                    nextAct = cpr.returnList().get(currState).getAction4();
                    nextActSub = nextAct.substring(1);
                    initStack = initStack.concat(nextActSub);
                } else if (goString.get(0).equals(")")) {
                    System.out.println(initStack);
                    nextAct = cpr.returnList().get(currState).getAction5();
                    initStack = initStack.concat(goString.remove(0).toString());
                    System.out.println(initStack);
                    initStack = initStack.substring(0, initStack.lastIndexOf("+"));
                    currState = Integer.parseInt(initStack.substring(initStack.length() - 1));
                    nextAct = cpr.returnList().get(currState).getAction5();
                    nextActSub = nextAct.substring(1);
                    initStack = initStack.concat(")" + nextActSub);
                    System.out.println(initStack);
                    initStack = initStack.substring(0, initStack.lastIndexOf("("));
                    currItem = "E";
                } else if (goString.get(0).equals("$")) {
                    nextAct = cpr.returnList().get(currState).getAction6();
                    initStack = initStack.concat(goString.remove(0).toString());
                    currItem = "$";
                }
                currState = Integer.parseInt(nextActSub);
                if (currItem.toString().equals("id")) {
                    String gotoVal = cpr.returnList().get(currState).getGotoF();
                    System.out.println(initStack);
                    initStack = initStack.substring(0, initStack.lastIndexOf("i"));
                    initStack = initStack.concat("F" + gotoVal);
                    System.out.println(initStack);
                    gotoVal = "";
                    currItem = "F";
                    while (currItem.contains("F")) {
                        gotoVal = cpr.returnList().get(currState).getGotoT();
                        initStack = initStack.substring(0, initStack.lastIndexOf("F"));
                        initStack = initStack.concat("T" + gotoVal);
                        gotoVal = "";
                        currItem = "T";
                    }
                    while (currItem.contains("T")) {
                        gotoVal = cpr.returnList().get(currState).getGotoE();
                        if (!gotoVal.isBlank()) {
                            currState = Integer.parseInt(cpr.returnList().get(currState).getGotoE());
                            initStack = initStack.substring(0, initStack.lastIndexOf("T"));
                            initStack = initStack.concat("E" + gotoVal);
                            nextActSub = gotoVal;
                            gotoVal = "";
                        }

                        currItem = "E";
                    }
                    // System.out.println("IM OUT ");
                } else if (currItem.toString().equals("E")) {
                    currState = 0;
                    // System.out.println(initStack);
                    String gotoF = cpr.returnList().get(currState).getGotoF();
                    initStack = initStack.concat("F" + gotoF);
                    System.out.println(initStack);
                    initStack = initStack.substring(0, initStack.lastIndexOf("F"));
                    String gotoE = cpr.returnList().get(currState).getGotoT();
                    initStack = initStack.concat("T" + gotoE);
                    currState = 2;
                    specialMove = 1;
                }else if (currItem.toString().equals("*")){
                    initStack = initStack.substring(0,initStack.lastIndexOf("*"));
                    // System.out.println(currState);
                    specialMove = 1;
                }

            }
        }
    }
}
