import java.util.Random;

public class quicksortImproved {
  Random rand = new Random();

  int partition(int a[], int lo, int hi) {
    int pivot = a[hi];
    int i = lo - 1;
    for (int j = lo; j < hi; j++) {
      if (less(a[j], pivot)) {
        i++;
        exch(a, i, j);
      }
    }
    i++;
    exch(a, i, hi);
    return i;
  }

  void sort(int[] arr, int lo, int hi) {
    if (hi <= lo)
      return;
    int randPiv = partition(arr,lo + rand.nextInt(hi - lo + 1),hi);
    sort(arr, lo, randPiv - 1);
    sort(arr, randPiv + 1, hi);
  }

  public void sort(int[] a) {
    int lo = 0;
    int hi = a.length - 1;
    sort(a, lo, hi);
  }

  private static void exch(int[] a, int i, int j) {
    int swap = a[i];
    a[i] = a[j];
    a[j] = swap;
  }

  private static boolean less(Comparable v, Comparable w) {
    return v.compareTo(w) < 0;
  }

}
