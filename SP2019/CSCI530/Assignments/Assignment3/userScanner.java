import java.util.*;

public class userScanner {

    public static String userScan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Syntax you would like to parse: ");
        String userIn = sc.nextLine();
        sc.close();
        return userIn;
    }

    public static ArrayList<String> splitString() {
        String userIn = userScan();
        // String userIn = "(id + id) * id";
        Character chIndex;
        ArrayList<String> pStr = new ArrayList<String>();
        for (int i = 0; i < userIn.length(); i++) {
            chIndex = userIn.charAt(i);
            if (Character.isLetter(chIndex) && Character.isLetter(chIndex + 1)) {
                pStr.add(chIndex + "" + userIn.charAt(i + 1));
                i++;
            } else if (Character.isWhitespace(chIndex)) {
            } else {
                pStr.add(chIndex + "");
            }
        }
        return pStr;
    }

    public static ArrayList<String> goCheck() {
        ArrayList<String> pStr = splitString();
                stringStack ss = new stringStack();

        pStr.spliterator();
        if ((pStr.get(0).contains("(") || pStr.get(0).contains("id")) && pStr.get(pStr.size() - 1).contains("$")) {
            System.out.println("PASS");
            ss.buildStack(pStr);
            return pStr;
        } else {
            System.out.println("FAIL");
            if ((!pStr.get(0).contains("(") || !pStr.get(0).contains("id"))
                    && pStr.get(pStr.size() - 1).contains("$")) {
                System.out.println("Your expression must start with either ( -OR- id");
            } else if (!pStr.get(pStr.size() - 1).contains("$")) {
                System.out.println("Your expression must end with $");
            }
            return null;
        }
    }

}