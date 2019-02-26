import java.io.*;
import java.util.*;

@SuppressWarnings("rawtypes")
public class Lec2Act3_1 {
  public static void main(String[] args) {
    int size = 1000;
    int[] arr = new int[size];
    int item = 0;
    for (int i = 0; i < size; i++) {
      item = (int) (Math.random() * 100);
      arr[i] = item;
    }

    quicksort qs = new quicksort();
    quicksortImproved qsi = new quicksortImproved();

    long startTime, endTime, elapsed;

    startTime = System.currentTimeMillis();
    qs.sort(arr);
    qs.printArray(arr);
    endTime = System.currentTimeMillis();
    elapsed = endTime - startTime;
    System.out.println(" Time: " + elapsed);
  }

}
