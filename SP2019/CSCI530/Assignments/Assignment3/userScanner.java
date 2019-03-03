import java.util.*;

public class userScanner {

    public String userScan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Syntax you would like to parse: ");
        String userIn = sc.nextLine();
        sc.close();
        return userIn;
    }

    public ArrayList<String> splitString() {
        // String userIn = userScan();
        String userIn = "(id + id) * id + id$";
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

    public String goCheck() {
        ArrayList<String> pStr = splitString();

        pStr.spliterator();
        if ((pStr.get(0).contains("(") || pStr.get(0).contains("id")) && pStr.get(pStr.size() - 1).contains("$")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            if ((!pStr.get(0).contains("(") || !pStr.get(0).contains("id"))
                    && pStr.get(pStr.size() - 1).contains("$")) {
                System.out.println("Your expression must start with either ( -OR- id");
            } else if (!pStr.get(pStr.size() - 1).contains("$")) {
                System.out.println("Your expression must end with $");
            }
        }
        return null;
    }

}