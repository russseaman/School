import java.util.*;
import java.io.*;
import java.nio.CharBuffer;
import java.nio.file.*;
import java.util.*;
import java.util.Spliterator;
import java.util.stream.*;
import java.nio.CharBuffer;
import java.util.stream.*;

@SuppressWarnings("rawtypes")
public class testbed {

  public static void stringParse(String filename) throws FileNotFoundException {
    List<String> keywords = Arrays.asList("int", "double", "String");

    List<Character> charList = new ArrayList<Character>();
    PrintStream ps = new PrintStream(System.out);
    Scanner s = null;
    char ch;
    try {
      s = new Scanner(new BufferedReader(new FileReader(filename)));
      while (s.hasNext()) {
        String str = s.next();
        for (int i = 0; i <= str.length() - 1; i++) {
          charList.add(str.charAt(i));
          ps.println(charList);
        }

        // operatorCheck(charList);
      }
      // ps.println(charList);
      for (int i = 0; i < charList.size(); i++) {
        ch = charList.get(i);
        if (Character.isLetter(ch)) {
          ps.println(ch + "\tLetter!");
        } else if (Character.isDigit(ch)) {
          ps.println(ch + "\tDigit!");
        } else {
          switch (ch) {
          case '=':
            ps.println("operator: " + ch);
            break;
          case '(':
            ps.println("operator: " + ch);
            break;
          case ')':
            ps.println("operator: " + ch);
            break;
          case '+':
            ps.println("operator: " + ch);
            break;
          case '-':
            ps.println("operator: " + ch);
            break;
          case '*':
            ps.println("operator: " + ch);
            break;
          case '/':
            ps.println("operator: " + ch);
            break;
          case ',':
            ps.println("operator: " + ch);
            break;
          case ';':
            ps.println("operator: " + ch);
            break;
          default:
            ps.println("NOT recognized" + ch);
          }
        }
      }

    } finally {
      if (s != null) {
        s.close();
      }
    }
  }

  public static void charDit() {

  }

  // public static void operatorCheck(List listCheck) {
  //   List operators = Arrays.asList("=", "(", ")", "+", "-", "*", "/", ",", ";");
  //
  //   for (int i = 0; i <= charList.size(); i++) {
  //     if (charList.get(i) == "=") {
  //       return EQUAL;
  //     }
  //   }
  // }

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    String filename = "input.txt";
    // System.out.println("Please enter a filename: ");
    // String filename = sc.next();
    stringParse(filename);
    // sc.close();
  }
}
