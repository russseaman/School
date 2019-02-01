import java.util.Random;

public class Lec2Act1A0{
    public static void insertionSort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            Comparable v = a[i];
            int j = i;
            while (j > 0 && less(v, a[j-1]))
                a[j] = a[--j];
            a[j] = v;
        }
        printArray(a);
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
                a[j] = a[j-1];
            a[lo] = v;
        }
        printArray(a);
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void printArray(Comparable[] a) {
        for (Comparable c : a)
            System.out.print(c + " ");
    }

    public static void main(String[] args) {
        Comparable[] arr1 = {'A', 'C', 'H', 'H', 'M', 'N', 'N', 'P', 'Q',
                             'X', 'Y', 'K', 'B', 'I', 'N', 'A', 'R', 'Y'};

        Comparable[] arr2 = {'A', 'C', 'H', 'H', 'M', 'N', 'N', 'P', 'Q',
                             'X', 'Y', 'K', 'B', 'I', 'N', 'A', 'R', 'Y'};

        Random rand = new Random();

        /* --Insertion sort without exchanges-- */
        insertionSort(arr1);

        System.out.println();

        /* --Binary Insertion Sort --*/
        binaryInsertionSort(arr2);
    }
}
