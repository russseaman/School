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
        String userIn = "(id + id) * id$";
        // String userIn = userScan();
        Character chIndex;

        Character[] charObjectArray = userIn.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        // System.out.println(charObjectArray)÷
        ArrayList<Character> pStr = new ArrayList<Character>();
        System.out.println(charObjectArray.toString());
        // for (int i = 0; i < userIn.length(); i++) {
        // chIndex = userIn.charAt(i);
        // if (Character.isLetter(chIndex) && Character.isLetter(chIndex + 1)) {
        // pStr.add(chIndex + "" + userIn.charAt(i + 1));
        // i++;
        // } else if (Character.isWhitespace(chIndex)) {
        // } else {
        // pStr.add(chIndex + "");
        // }
        // }
        return charObjectArray.toString();
        // return ;

    }
}