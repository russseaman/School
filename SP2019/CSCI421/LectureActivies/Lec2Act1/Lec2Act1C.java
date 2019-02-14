import java.util.Random;
import java.util.Arrays;
import java.util.*;

public class Lec2Act1C {
  public static void insSortWith(Comparable[] a) {
    int N = a.length;
    for (int i = 0; i < N; i++)
      for (int j = i; j > 0; j--)
        if (less(a[j], a[j - 1]))
          exch(a, j, j - 1);
        else
          break;
  }

  public static void insSortWithOut(Comparable[] a) {
    int N = a.length;
    for (int i = 1; i < N; i++) {
      Comparable v = a[i];
      int j = i;
      while (j > 0 && less(v, a[j - 1]))
        a[j] = a[--j];
      a[j] = v;
    }

  }

  public static void binaryInsertionSort(Comparable[] a) {
    int N = a.length;
    for (int i = 1; i < N; i++) {
      Comparable v = a[i];
      int lo = 0;
      int hi = i;
      while (lo < hi) {
        int mid = lo + (hi - lo) / 2;
        if (less(v, a[mid]))
          hi = mid;
        else
          lo = mid + 1;
      }
      for (int j = i; j > lo; --j)
        a[j] = a[j - 1];
      a[lo] = v;
    }
  }

  private static boolean less(Comparable v, Comparable w) {
    return v.compareTo(w) < 0;
  }

  private static void exch(Comparable[] a, int i, int j) {
    Comparable swap = a[i];
    a[i] = a[j];
    a[j] = swap;
  }

  public static void main(String[] args) {
    Random rand = new Random();
    Comparable arr1[] = new Comparable[8000];
    for (int i = 0; i < arr1.length; i++)
      arr1[i] = rand.nextInt();

    long startTime, endTime, elapsed;

    /* --Insertion sort with exchanges-- */
    startTime = System.currentTimeMillis();
    insSortWith(arr1);
    endTime = System.currentTimeMillis();
    elapsed = endTime - startTime;

    System.out.println();
    System.out.println("Insertion Sort Time (with exchanges): " + elapsed);

    /* --Insertion sort without exchanges-- */
    startTime = System.currentTimeMillis();
    insSortWithOut(arr1);
    endTime = System.currentTimeMillis();
    elapsed = endTime - startTime;

    System.out.println();
    System.out.println("Insertion Sort Time (w/ exchanges): " + elapsed);

    /* --Binary Insertion Sort --*/
    startTime = System.currentTimeMillis();
    binaryInsertionSort(arr1);
    endTime = System.currentTimeMillis();
    elapsed = endTime - startTime;

    System.out.println();
    System.out.println("Binary Insertion Sort Time: " + elapsed);
  }
}
