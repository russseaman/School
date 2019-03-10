import java.util.Comparator;
import java.lang.NullPointerException;

public class BinarySearchDeluxe {
    public static <Key> int firstIndexOf(final Key[] a, final Key key, final Comparator<Key> comparator) {
        if (a == null || key == null || comparator == null)
            throw new NullPointerException("Cannot find first key index");
        if (a.length == 0)
            return -1;
        int left = 0;
        int right = a.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (comparator.compare(key, a[mid]) <= 0)
                right = mid;
            else
                left = mid;
        }
        if (comparator.compare(key, a[left]) == 0)
            return left;
        if (comparator.compare(key, a[right]) == 0)
            return right;
        return -1;
    }

    public static <Key> int lastIndexOf(final Key[] a, final Key key, final Comparator<Key> comparator) {
        if (a == null || key == null || comparator == null)
            throw new NullPointerException("Cannot find Last key index");
        if (a.length != 0) {// Binary Search Algorithm
            int left = 0;
            int right = a.length - 1;
            while (left + 1 < right) {
                int mid = left + (right - left) / 2;
                if (comparator.compare(key, a[mid]) < 0)
                    right = mid;
                else
                    left = mid;
            }
            if (comparator.compare(key, a[right]) == 0)
                return right;
            if (comparator.compare(key, a[left]) == 0)
                return left;
            return -1;
        } else
            return -1;
    }
}
