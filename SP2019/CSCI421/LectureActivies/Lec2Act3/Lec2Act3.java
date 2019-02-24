import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.Random;

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
    StdRandom.Shuffle(a);
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

  public static int[] getArray() {
    int size = 10;
    int[] array = new int[size];
    int item = 0;
    for (int i = 0; i < size; i++) {
      item = (int) (Math.random() * 100);
      array[i] = item;
    }
    return array;
  }

  static void printArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i)
      System.out.print(arr[i] + " ");
    System.out.println();
  }

  public static void main(String[] args) {
    int arr[] = { 10, 7, 8, 9, 1, 5 };
    int n = arr.length;

    System.out.println("sorted array");
    printArray(arr);

  }

}
