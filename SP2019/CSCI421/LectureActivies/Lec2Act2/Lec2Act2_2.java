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

  // public static void sort(int[] a) {
  //   sort(a, 0, a.length - 1);
  // }

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
    int size = 2000;

    int[] arr = new int[size];
    int item = 0;
    int n = arr.length;
    for (int i = 0; i < size; i++) {
      item = (int) (Math.random() * 100);
      arr[i] = item;
    }
    int[] arr2 = new int[size];
    int item2 = 0;
    int n2 = arr2.length;
    for (int i = 0; i < size; i++) {
      item2 = (int) (Math.random() * 100);
      arr2[i] = item2;
    }

    long startTime, endTime, elapsed;

    System.out.println("Insertion sort with array size " + size);
    System.out.println("=========================BEST CASE==========================");
    startTime = System.currentTimeMillis();
    sort(arr, 0, n - 1);
    printArray(arr);
    endTime = System.currentTimeMillis();
    elapsed = endTime - startTime;
    System.out.println("BEST CASE Time: " + elapsed);

    System.out.println("=========================WORST CASE==========================");
    startTime = System.currentTimeMillis();
    sort(arr2, 0, n2 - 1);
    printArray(arr2);
    endTime = System.currentTimeMillis();
    elapsed = endTime - startTime;
    System.out.println("WORST CASE Time: " + elapsed);

  }
}
