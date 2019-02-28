import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;
import java.util.Random;

public class Lec2Act3_2<Key> implements Iterable<Key> {
    private Key[] pq;
    private int n;
    private Comparator<Key> comparator;

    public Lec2Act3_2(int initCapacity) {
        pq = (Key[]) new Object[initCapacity + 1];
        n = 0;
    }

    public Lec2Act3_2() {
        this(1);
    }

    public Lec2Act3_2(int initCapacity, Comparator<Key> comparator) {
        this.comparator = comparator;
        pq = (Key[]) new Object[initCapacity + 1];
        n = 0;
    }

    public Lec2Act3_2(Comparator<Key> comparator) {
        this(1, comparator);
    }

    public Lec2Act3_2(Key[] keys) {
        n = keys.length;
        pq = (Key[]) new Object[keys.length + 1];
        IntStream.range(0, n).forEach(i -> pq[i + 1] = keys[i]);
        IntStream.iterate(n / 2, k -> k >= 1, k -> k - 1).forEach(this::sink);
        assert isMaxHeap();
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public Key max() {
        if (isEmpty())
            throw new NoSuchElementException("Priority queue underflow");
        return pq[1];
    }

    private void resize(int capacity) {
        assert capacity > n;
        Key[] temp = (Key[]) new Object[capacity];
        for (int i = 1; i <= n; i++) {
            temp[i] = pq[i];
        }
        pq = temp;
    }

    public void insert(Key x) {

        if (n == pq.length - 1)
            resize(2 * pq.length);

        pq[++n] = x;
        swim(n);
        assert isMaxHeap();
    }

    public Key delMax() {
        if (isEmpty())
            throw new NoSuchElementException("Priority queue underflow");
        Key max = pq[1];
        exch(1, n--);
        sink(1);
        pq[n + 1] = null;
        if ((n > 0) && (n == (pq.length - 1) / 4))
            resize(pq.length / 2);
        assert isMaxHeap();
        return max;
    }

    private void swim(int k) {
        while (k > 1 && less(k / 2, k)) {
            exch(k, k / 2);
            k = k / 2;
        }
    }

    private void sink(int k) {
        while (2 * k <= n) {
            int j = 2 * k;
            if (j < n && less(j, j + 1))
                j++;
            if (!less(k, j))
                break;
            exch(k, j);
            k = j;
        }
    }

    private boolean less(int i, int j) {
        if (comparator == null) {
            return ((Comparable<Key>) pq[i]).compareTo(pq[j]) < 0;
        } else {
            return comparator.compare(pq[i], pq[j]) < 0;
        }
    }

    private void exch(int i, int j) {
        Key swap = pq[i];
        pq[i] = pq[j];
        pq[j] = swap;
    }

    private boolean isMaxHeap() {
        return isMaxHeap(1);
    }

    private boolean isMaxHeap(int k) {
        if (k > n)
            return true;
        int left = 2 * k;
        int right = 2 * k + 1;
        if (left <= n && less(k, left))
            return false;
        if (right <= n && less(k, right))
            return false;
        return isMaxHeap(left) && isMaxHeap(right);
    }

    public Iterator<Key> iterator() {
        return (Iterator<Key>) new HeapIterator();
    }
    private class HeapIterator implements Iterator<int[]> {

        private Lec2Act3_2<int[]> copy;

        public HeapIterator() {
            if (comparator == null) copy = new Lec2Act3_2<>(size());
            else {
                copy = (Lec2Act3_2<int[]>) new Lec2Act3_2<Key>(size(), comparator);
            }
            IntStream.rangeClosed(1, n).forEach(i -> copy.insert((int[]) pq[i]));
        }

        public boolean hasNext()  { return !copy.isEmpty();                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public int[] next() {
            if (!hasNext()) throw new NoSuchElementException();
            return copy.delMax();
        }
    }

    public static void main(String[] args) {
        Lec2Act3_2<Integer> pq = new Lec2Act3_2<Integer>();

        int itCount = 4; //Iteration count...ie (4 = 8000), since it will be 1000 * 2, 2000*2

        long startTime, endTime, elapsed;
        int N = 1000;
        long totalTime = 0;

        while (itCount> 0){
            startTime = System.currentTimeMillis();

            int i = 0;

            Random rand = new Random();

            while ( i < N ){
                int item = rand.nextInt(100);
                pq.insert(item);
                i++;
            }
            i = 0;

            while (i < N/2){
                pq.delMax();
                i++;
            }

            endTime = System.currentTimeMillis();
            elapsed =  endTime - startTime;
            totalTime = totalTime + elapsed;
            System.out.println("N\t="+N);
            System.out.println("Time \t = "+elapsed+" Milliseconds");
            N = N*2;
            itCount--;
        }
        System.out.println("===============================================");
        System.out.println("Average TIme \t=" + totalTime/4 +" Milliseconds");
    }
}

