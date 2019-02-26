import java.util.Random;
import java.util.Arrays;
import java.util.*;

public class Lec2Act2_2 {
  private static int partition(int[] a, int lo, int hi) {
    int pivot = a[hi];
    int i = (lo - 1);
    for (int j = lo; j < hi; j++) {
      if (a[j] <= pivot) {
        i++;

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
      }
    }

    int temp = a[i + 1];
    a[i + 1] = a[hi];
    a[hi] = temp;

    return i + 1;
  }

  public static void sort(int[] a) {
    sort(a, 0, a.length - 1);
  }

  static void sort(int a[], int lo, int hi) {
    if (lo < hi) {
      int pi = partition(a, lo, hi);

      sort(a, lo, pi - 1);
      sort(a, pi + 1, hi);
    }
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
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i;
    }
    Collections.shuffle(Arrays.asList(arr));

    int[] arr2 = new int[size];
    int item2 = 0;
    int n2 = arr2.length;
    for (int i = 0; i < size; i++) {
      item2 = (int) (i);
      arr2[i] = item2;
    }

    long startTime, endTime, elapsed;
    long startTime2, endTime2, elapsed2;

    System.out.println("Insertion sort with array size " + size);
    System.out.println("=========================WORST CASE==========================");
    startTime = System.currentTimeMillis();
    sort(arr);
    printArray(arr);
    endTime = System.currentTimeMillis();
    elapsed = endTime - startTime;
    System.out.println("WORST CASE Time: " + elapsed);

    System.out.println("=========================BEST CASE==========================");
    startTime2 = System.currentTimeMillis();
    sort(arr2, 0, n2 - 1);
    printArray(arr2);
    endTime2 = System.currentTimeMillis();
    elapsed2 = endTime2 - startTime2;
    System.out.println("BEST CASE Time: " + elapsed2);

  }
}
