import java.util.Random;

//Driver class
public class Act1{
  public static void main(String[] args) {
    Random r = new Random();
    int[] integers = new int[500];
    for (int i = 0; i < integers.length; i++) {
      integers[i] = r.nextInt();
    }

    ThreeSumBrute tsb = new ThreeSumBrute();
    ThreeSumHash tsh = new ThreeSumHash();
    ThreeSumImp tsi = new ThreeSumImp();
    BinSearch bs = new BinSearch();
    // tsb.count(integers);
    // tsh.count(integers);

    long startTime = System.currentTimeMillis();
    // tsb.count(integers);
    tsh.count(integers);
    // tsi.count(integers);
    // bs.binarySearch(integers);
    long endTime = System.currentTimeMillis();
    long elapsed = endTime - startTime;
    System.out.println(elapsed);
  }
}
