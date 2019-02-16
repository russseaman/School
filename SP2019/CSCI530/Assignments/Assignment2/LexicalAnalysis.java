import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LexicalAnalysis {

  private String[] keywords = { "int", "double", "String" };
  HashMap<String, ArrayList<Integer>> keywordsTable;

  HashMap<String, ArrayList<Integer>> otherWords = new HashMap<String, ArrayList<Integer>>();

  public LexicalAnalysis(String fileName) {

    Scanner kb = null;
    int lineNumber = 0;

    try {
      kb = new Scanner(new File(fileName));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    keywordsTable = new HashMap<String, ArrayList<Integer>>();
    for (int i = 0; i < 2; i++) {
      keywordsTable.put(keywords[i], new ArrayList<Integer>());
    }

    while (kb.hasNextLine()) {

      lineNumber++;

      String line = kb.nextLine();

      String[] lineparts = line.split("\\s+|\\.+|\\;+|\\(+|\\)+|\\\"+|\\:+|\\[+|\\]+");
      // String[] lineparts = line.split("\\s+|\\.+|\\;+|\\(+|\\)+|\\\"+|\\:+|\\[+|\\]+");

      for (String x : lineparts) {

        ArrayList<Integer> list = keywordsTable.get(x);
        if (list == null) {
          list = otherWords.get(x);
          if (list == null) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.add(lineNumber);
            otherWords.put(x, temp);
          } else {
            otherWords.remove(x);
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.add(lineNumber);
            otherWords.put(x, temp);
          }
        } else {
          keywordsTable.remove(x);
          ArrayList<Integer> temp = new ArrayList<Integer>();
          temp.add(lineNumber);
          keywordsTable.put(x, temp);
        }
      }
    }
    System.out.println("Keywords:");
    printMap(keywordsTable);
    System.out.println();
    System.out.println("Other Words:");
    printMap(otherWords);

  }

  public static void printMap(Map<String, ArrayList<Integer>> mp) {
    Iterator<Map.Entry<String, ArrayList<Integer>>> it = mp.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry<String, ArrayList<Integer>> pairs = (Map.Entry<String, ArrayList<Integer>>) it.next();
      System.out.print(pairs.getKey() + " = ");
      printList(pairs.getValue());
      System.out.println();
      it.remove();
    }
  }

  public static void printList(List x) {

    for (Object m : x) {
      System.out.print(m + ", ");
    }

  }

  public static void main(String args[]) {
    new LexicalAnalysis("lexitest.txt");
  }
}
