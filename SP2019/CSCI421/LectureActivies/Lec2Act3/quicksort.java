import java.util.Random;

public class quicksort {
  int partition(int a[], int lo, int hi) {
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

  void sort(int a[], int lo, int hi) {
    if (hi <= lo)
      return;
    int j = partition(a, lo, hi);
    sort(a, lo, j - 1);
    sort(a, j + 1, hi);
  }

  public void sort(int a[]) {
    sort(a, 0, a.length - 1);
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
