import java.io.*;
import java.util.*;
import java.util.Spliterator;
import java.nio.CharBuffer;
import java.nio.file.*;
import java.util.stream.*;

@SuppressWarnings("rawtypes")
public class Assign2 {

  // public static void keywordCheck(String charAt)

  public static void stringParse(String filename) throws FileNotFoundException {
    List<Character> charList = new ArrayList<Character>();
    PrintStream ps = new PrintStream(System.out);
    Scanner s = null;
    try {
      s = new Scanner(new BufferedReader(new FileReader(filename)));
      while (s.hasNext()) {
        String str = s.next();
        for (int i = 0; i <= str.length() - 1; i++) {
          // if (i == 0) {
          //   System.out.println((i + 1) + "\t" + str.charAt(i));
          // }
          charList.add(str.charAt(i));
          ps.println(charList);
        }
      }
    } finally {
      if (s != null) {
        s.close();
      }
    }

  }

  public static class keywords {
    List<String> keywords = Arrays.asList("int", "double", "String");
  }

  public class operators {
    List operators = Arrays.asList("=", "(", ")", "+", "-", "*", "/", ",", ";");
  }

  public class printRes {

  }

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    String filename = "input.txt";
    // System.out.println("Please enter a filename: ");
    // String filename = sc.next();
    stringParse(filename);
    // sc.close();

  }

}
