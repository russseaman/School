import java.io.*;
import java.util.*;

@SuppressWarnings("rawtypes")
public class Lec2Act3 {

  public static int partition(Comparable[] a, int lo, int hi) {
    int i = lo, j = hi + 1;
    while (true) {
      while (less(a[++i], a[lo]))
        if (i == hi)
          break;
      while (less(a[lo], a[--j]))
        if (j == lo)
          break;
      if (i >= j)
        break;
      exch(a, i, j);
    }
    exch(a, lo, j);
    return j;
  }

  public static void sort(Comparable[] a) {
    // StdRandom.Shuffle(a);
    sort(a, 0, a.length - 1);
  }

  public static void sort(Comparable[] a, int lo, int hi) {
    if (hi <= lo)
      return;
    int j = partition(a, lo, hi);
    sort(a, lo, j - 1);
    sort(a, j + 1, hi);
  }

  private static boolean less(Comparable v, Comparable w) {
    return v.compareTo(w) < 0;
  }

  private static void exch(Comparable[] a, int i, int j) {
    Comparable swap = a[i];
    a[i] = a[j];
    a[j] = swap;
  }

  static void printArray(Comparable arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i)
      System.out.print(arr[i] + " ");
    System.out.println();
  }

  public static void main(String[] args) {
    int size = 1000;
    Comparable[] arr = new Comparable[size];
    int item = 0;
    for (int i = 0; i < size; i++) {
      item = (int) (Math.random() * 100);
      arr[i] = item;
    }

    sort(arr);
    System.out.println("sorted array");
    printArray(arr);

  }

}
