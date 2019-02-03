import java.util.Arrays;
import java.util.Scanner;

public class BinSearch{
public static void binaryInsSort(int[] a) {
  int N = a.length;
  for (int i = 1; i < N; i++) {
      int v = a[i];
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
          a[j] = a[j-1];
      a[lo] = v;
  }
}
private static boolean less(Comparable v, Comparable w) {
    return v.compareTo(w) < 0;
}
}
