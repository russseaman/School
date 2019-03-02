import java.util.*;

public class userScanner {

    public String userScan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Syntax you would like to parse: ");
        String userIn = sc.nextLine();
        sc.close();
        return userIn;
    }

    public String splitString() {
        String userIn = userScan();
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
        System.out.println(pStr);
        return pStr.toString();

    }
}