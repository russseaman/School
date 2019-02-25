import java.util.Random;
import java.util.Arrays;
import java.util.*;

@SuppressWarnings("unchecked")
public class Lec2Act2_1 {

  private static final int CUTOFF = 25;

  private static void merge(int[] a, int[] aux, int lo, int mid, int hi) {

    for (int k = lo; k <= hi; k++)
      aux[k] = a[k];
    int i = lo, j = mid + 1;
    for (int k = lo; k <= hi; k++) {
      if (i > mid)
        aux[k] = a[j++];
      else if (j > hi)
        aux[k] = a[i++];
      else if (less(aux[j], aux[i]))
        aux[k] = a[j++];
      else
        aux[k] = a[i++];
    }
  }

  private static void sort(int[] a, int[] aux, int lo, int hi) {
    if (hi <= lo + CUTOFF - 1) {
      insSort(a);
      return;
    }
    int mid = lo + (hi - lo) / 2;
    sort(aux, a, lo, mid);
    sort(aux, a, mid + 1, hi);
    if (!less(a[mid + 1], a[mid]))
      return;
    merge(aux, a, lo, mid, hi);
  }

  public static void sort(int[] a) {
    int[] aux = new int[a.length];
    sort(aux, a, 0, a.length - 1);
  }

  public static void insSort(int[] a) {
    int N = a.length;
    for (int i = 0; i < N; i++)
      for (int j = i; j > 0; j--)
        if (less(a[j], a[j - 1]))
          exch(a, j, j - 1);
        else
          break;
  }

  private static void exch(int[] a, int i, int j) {
    int swap = a[i];
    a[i] = a[j];
    a[j] = swap;
  }

  private static boolean less(Comparable v, Comparable w) {
    return v.compareTo(w) < 0;
  }

  static void printArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i)
      System.out.print(arr[i] + " ");
    System.out.println();
  }

  public static void main(String[] args) {
    int size = 8000;
    int[] arr = new int[size];
    int item = 0;
    for (int i = 0; i < size; i++) {
      item = (int) (Math.random() * 100);
      arr[i] = item;
    }

    long startTime, endTime, elapsed;

    System.out.println("Merge sort with array size " + size);
    System.out.println("Cutoff at: " + CUTOFF);
    startTime = System.currentTimeMillis();
    Lec2Act2_1.sort(arr);
    endTime = System.currentTimeMillis();
    elapsed = endTime - startTime;
    System.out.println("Merge Sort Time: " + elapsed);

  }
}
