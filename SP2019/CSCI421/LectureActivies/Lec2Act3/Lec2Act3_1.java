import java.io.*;
import java.util.*;
import java.util.Random;

public class Lec2Act3_1 {

  public void printArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i)
      System.out.print(arr[i] + " ");
    System.out.println();
  }

  public static void main(String[] args) {
    int size = 8000;
    int arr[] = new int[size];
    int arr2[] = new int[size];
    int item = 0;
    for (int i = 0; i < size; i++) {
      item = (int) (Math.random() * 100);
      arr[i] = item;
    }

    for (int i = 0; i < arr.length; i++) {
      arr2[i] = arr[i];
    }

    quicksort qs = new quicksort();
    quicksortImproved qsi = new quicksortImproved();

    long startTime, endTime, elapsed;

    System.out.println("For Array Size: " + size);
    startTime = System.currentTimeMillis();
    qs.sort(arr);
    endTime = System.currentTimeMillis();
    elapsed = endTime - startTime;
    System.out.println("QuickSort Time: " + elapsed);

    startTime = System.currentTimeMillis();
    qsi.sort(arr2);
    endTime = System.currentTimeMillis();
    elapsed = endTime - startTime;
    System.out.println("QuickSort Improved Time: " + elapsed);
  }

}
