import java.util.*;
import java.io.*;
import java.nio.CharBuffer;
import java.nio.file.*;
import java.util.*;
import java.util.Spliterator;
import java.util.stream.*;
import java.nio.CharBuffer;
import java.util.stream.*;
import java.lang.*;

public class Assign2 {
  public static void stringParse(String filename) throws IOException {
    StringBuilder constList = new StringBuilder();
    PrintStream ps = new PrintStream(System.out);
    Scanner s = null;
    Character chInd;
    String chDecs = "";
    StringBuilder numList = new StringBuilder();
    try {
      BufferedReader bufReader = new BufferedReader(new FileReader(filename));
      ArrayList<String> listOfLines = new ArrayList<>();
      String line = bufReader.readLine();
      while (line != null) {
        listOfLines.add(line);
        line = bufReader.readLine();
      }
      bufReader.close();
      for (int ls = 0; ls < listOfLines.size(); ls++) {
        for (int index = 0; index < listOfLines.get(ls).length(); index++) {
          chInd = listOfLines.get(ls).charAt(index);
          if (Character.isLetter(chInd)) {
            chDecs = "Letter";
          } else if (Character.isDigit(chInd)) {
            chDecs = "Number";
          } else {
            chDecs = "Other";
          }
          switch (chDecs) {
          case "Letter":
            constList.append(chInd);
            if (!Character.isLetter(listOfLines.get(ls).charAt(index + 1))) {
              if (constList.toString().contains("int") || constList.toString().contains("String")) {
                ps.println("Line" + (ls + 1) + ": " + ((index + 2) - constList.length()) + " keyword: " + constList);
              } else {
                if (!Character.isLetter(listOfLines.get(ls).charAt(index + 1))) {
                  chDecs = "Other";
                  ps.println("Line" + (ls) + ": " + (index) + " identifier: " + constList);
                }
              }
            }
            break;
          case "Number":
            numList.append(chInd);
            constList.setLength(0);
            if (!Character.isDigit(listOfLines.get(ls).charAt(index + 1))) {
              ps.println("Line" + (ls + 1) + ": " + ((index + 1) - numList.length()) + " int constant: " + numList);
            }
            break;
          case "Other":
            numList.setLength(0);
            constList.setLength(0);
            switch (chInd) {
            case '=':
              ps.println("Line" + (ls + 1) + ": " + (index + 1) + " operator: " + chInd);
              break;
            case '(':
              ps.println("Line" + (ls + 1) + ": " + (index + 1) + " operator: " + chInd);
              break;
            case ')':
              ps.println("Line" + (ls + 1) + ": " + (index + 1) + " operator: " + chInd);
              break;
            case '+':
              ps.println("Line" + (ls + 1) + ": " + (index + 1) + " operator: " + chInd);
              break;
            case '-':
              ps.println("Line" + (ls + 1) + ": " + (index + 1) + " operator: " + chInd);
              break;
            case '*':
              ps.println("Line" + (ls + 1) + ": " + (index + 1) + " operator: " + chInd);
              break;
            case '/':
              ps.println("Line" + (ls + 1) + ": " + (index + 1) + " operator: " + chInd);
              break;
            case ',':
              ps.println("Line" + (ls + 1) + ": " + (index + 1) + " operator: " + chInd);
              break;
            case ';':
              ps.println("Line" + (ls + 1) + ": " + (index + 1) + " operator: " + chInd);
              break;
            case '"':
              if (Character.isLetter(listOfLines.get(ls).charAt(index) + 1)) {
                chDecs = "Letter";
              }
              ps.println("Line" + (ls) + ": " + (index) + " string const: " + "\"" + constList);
              break;
            }
          }
        }
        constList.setLength(0);
        numList.setLength(0);
      }
    } finally

    {
      if (s != null) {
        s.close();
      }
    }
  }

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    String filename = "input.txt";
    // System.out.println("Please make sure the file you are trying to analyze is in the same dir");
    // System.out.println("Please enter a filename: ");
    // String filename = sc.next();
    stringParse(filename);
    // sc.close();
  }
}
