import java.util.Random;

public class Lecture02Activity01 {
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
}
