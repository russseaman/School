import java.util.*;

public class userScanner {

    public String userScan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Syntax you would like to parse: ");
        String userIn = sc.nextLine();
        sc.close();
        return userIn;
    }

    public ListIterator<String> splitString() {
        // String userIn = userScan();
        String userIn = "(id + id) * id$";
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
        return pStr.listIterator();
    }

    public String goCheck(){
        ListIterator<String> userString = splitString();

        // System.out.println(String.;
        // // for (int i = 0; i< userString.length(); i++){
        //     System.out.println(userString.charAt(i));
        // }

        return null;
    }

}