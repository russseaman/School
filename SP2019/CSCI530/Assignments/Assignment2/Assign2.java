import java.util.Scanner;
import java.io.*;

public class Assign2{

  public static void openFile(String filename) throws IOException {
    File file = new File(filename);
    BufferedReader br = new BufferedReader(new FileReader(file));

    String st;
    while((st = br.readLine()) != null)
      System.out.println(st);

    br.close();
  }

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter a filename: ");

    String filename = sc.next();
    openFile(filename);
    sc.close();
  }
}
