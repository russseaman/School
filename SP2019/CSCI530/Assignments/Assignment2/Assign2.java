import java.io.*;
import java.util.*;
import java.nio.CharBuffer;
import java.nio.file.*;
import java.util.stream.*;

@SuppressWarnings("rawtypes")
public class Assign2 {
  //
  // public static void openFile(String filename) throws IOException {
  //   File file = new File(filename);
  //   BufferedReader br = new BufferedReader(new FileReader(file));
  //
  //   String st;
  //   while ((st = br.readLine()) != null)
  //     System.out.println(st);
  //
  //   br.close();
  // }

  public static void main(String[] args) throws IOException {
    // Scanner sc = new Scanner(System.in);
    List keywords = Arrays.asList("int", "double", "String");
    List operators = Arrays.asList("=", "(", ")", "+", "-", "*", "/", ",", ";");
    // keywords.forEach(n -> System.out.println(n));
    // operators.forEach(n -> System.out.println(n));

    String filename = "input.txt";
    // System.out.println("Please enter a filename: ");
    //
    // String filename = sc.next();
    // openFile(filename);
    // sc.close();
    //
    //
    Stream<String> streamLines = Files.lines(Paths.get(filename));
    streamLines.forEach(System.out::println);

  }
}

// this is a test
