import java.util.Random;

//Driver class
public class Assign1{
  public static void main(String[] args) {
    Random r = new Random();
    int[] integers = new int[250];
    for (int i = 0; i < integers.length; i++) {
      integers[i] = r.nextInt();
    }

    long startTime, endTime, elapsed;

    System.out.println("Array Size of random numbers: " + integers.length);

    ThreeSumBrute tsb = new ThreeSumBrute();
    ThreeSumHash tsh = new ThreeSumHash();
    ThreeSumImp tsi = new ThreeSumImp();
    BinSearch bs = new BinSearch();

    startTime = System.currentTimeMillis();
    tsb.count(integers);
    endTime = System.currentTimeMillis();
    elapsed = endTime - startTime;
    System.out.println("Time using Brute Force Method: " + elapsed);

    startTime = System.currentTimeMillis();
    tsh.count(integers);
    endTime = System.currentTimeMillis();
    elapsed = endTime - startTime;
    System.out.println("Time using Hash method: " + elapsed);

    startTime = System.currentTimeMillis();
    tsi.count(integers);
    endTime = System.currentTimeMillis();
    elapsed = endTime - startTime;
    System.out.println("Time using Three sum Improved: " + elapsed);

    startTime = System.currentTimeMillis();
    bs.binaryInsSort(integers);
    endTime = System.currentTimeMillis();
    elapsed = endTime - startTime;
    System.out.println("Time using Binary Insertion Sort: " + elapsed);
  }
}
