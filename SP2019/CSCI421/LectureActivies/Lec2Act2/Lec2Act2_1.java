import java.util.*;

@SuppressWarnings("unchecked")
public class Lec2Act2_1 {
  private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {

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

  private static void mergeSort(Comparable[] a, Comparable[] aux, int lo, int hi) {
    if (hi <= lo + 7 - 1) {
      insSort(a);
      return;
    }
    int mid = lo + (hi - lo) / 2;
    mergeSort(aux, a, lo, mid);
    mergeSort(aux, a, mid + 1, hi);
    if (!less(a[mid + 1], a[mid]))
      return;
    merge(aux, a, lo, mid, hi);
  }

  public static void insSort(Comparable[] a) {
    int N = a.length;
    for (int i = 0; i < N; i++)
      for (int j = i; j > 0; j--)
        if (less(a[j], a[j - 1]))
          exch(a, j, j - 1);
        else
          break;
  }

  public static void mergeSort(Comparable[] a) {
    Comparable[] aux = new Comparable[a.length];
    mergeSort(aux, a, 0, a.length - 1);
  }

  private static void exch(Comparable[] a, int i, int j) {
    Comparable swap = a[i];
    a[i] = a[j];
    a[j] = swap;
  }

  private static boolean less(Comparable v, Comparable w) {
    return v.compareTo(w) < 0;
  }

  // private static int genRandomNumber(Comparable range, int min, int max) {
  //   Comparable arr[] = new Comparable[range];
  //   Random r = new Random();
  //   return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();
  // }

  public static void main(String[] args) {
    Random rand = new Random();
    Comparable arr[] = new Comparable[8000];
    for (int i = 0; i < arr.length; i++)
      arr[i] = rand.nextInt();

    long startTime, endTime, elapsed;

    System.out.println("Merge sort with array size " + 1000);
    startTime = System.currentTimeMillis();
    mergeSort(arr);
    endTime = System.currentTimeMillis();
    elapsed = endTime - startTime;
    System.out.println("Merge Sort Time :" + elapsed);

  }
}
