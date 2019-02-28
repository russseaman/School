import java.util.Comparator;

@SuppressWarnings("unchecked")
public class maxQueue<Key extends Comparable<Key>> {

  private Key[] pq;
  private int n;
  private Comparator<Key> comparator;

  public maxQueue(int capacity) {
    pq = (Key[]) new Comparable[capacity + 1];
    n = 0;
  }

  public maxQueue() {
    this(1);
  }

  public maxQueue(int capacity, Comparator<Key> comparator) {
    this.comparator = comparator;
    pq = (Key[]) new Object[capacity + 1];
    n = 0;
  }

  public maxQueue(Comparator<Key> comparator) {
    this(1, comparator);
  }

  public maxQueue(Key[] keys) {
    n = keys.length;
    pq = (Key[]) new Object[keys.length + 1];
    for (int i = 0; i < n; i++)
      pq[i + 1] = keys[i];
    for (int k = n / 2; k >= 1; k--)
      sink(k);
  }

  public boolean isEmpty() {
    return n == 0;
  }

  public Key delMax() {
    Key max = pq[1];
    exch(1, n--);
    sink(1);
    pq[n + 1] = null;
    return max;
  }

  private void swim(int k) {
    while (k > 1 && less(k / 2, k)) {
      exch(k, k / 2);
      k = k / 2;
    }
  }

  public void insert(Key x) {
    if (n == pq.length - 1)
      resize(2 * pq.length);

    pq[++n] = x;
    swim(n);
  }

  private void resize(int capacity) {
    assert capacity > n;
    Key[] temp = (Key[]) new Object[capacity];
    for (int i = 1; i <= n; i++) {
      temp[i] = pq[i];
    }
    pq = temp;
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
    return pq[i].compareTo(pq[j]) < 0;
  }

  private void exch(int i, int j) {
    Key t = pq[i];
    pq[i] = pq[j];
    pq[j] = t;
  }

}
