import java.io.*;
import java.util.*;
import java.nio.CharBuffer;
import java.nio.file.*;
import java.util.stream.*;

public class testbed {

  public static void main(String[] args) throws IOException {
    String filename = "input.txt";

    Reader r = new FileReader(filename);

    int i = -1;
    while ((i = r.read()) != -1) {
      System.out.println((char) i);
    }
    r.close();
  }
  // public static List<Character> listChars(String str) {
  //   List<Character> chars = new ArrayList<>();
  //   for (char ch : str.toCharArray()) {
  //     chars.add(ch);
  //   }
  //   return chars;
  // }
  //
  // @SuppressWarnings("rawtypes")
  // public static void main(String[] args) throws IOException {
  //   List keywords = Arrays.asList("int", "double", "String");
  //   List operators = Arrays.asList("=", "(", ")", "+", "-", "*", "/", ",", ";");
  //   // keywords.forEach(n -> System.out.println(n));
  //   // operators.forEach(n -> System.out.println(n));
  //
  //
  //   Stream<String> streamLines = Files.lines(Paths.get(filename));
  //   streamLines.forEach(System.out::println);
  //
  //   String s = streamLines.stream().map(Object::toString).collect(Collectors.joining(","));
}
