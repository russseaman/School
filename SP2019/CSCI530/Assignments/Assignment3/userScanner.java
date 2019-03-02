import java.util.*;

public class userScanner {

    public Scanner userScan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Syntax you would like to parse: ");
        String userIn = sc.nextLine();
        splitString(userIn);
        sc.close();
        return null;
    }

    public static String splitString(String userIn) {
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
        return pStr.toString();
    }
}