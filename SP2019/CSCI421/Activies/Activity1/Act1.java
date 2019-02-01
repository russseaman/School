import java.util.Arrays;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;


public class Act1{
  //Brute Force 3-sum problem
  public void bruteForce3Sum(int[] arr){
    int N = arr.length;
    int count = 0;
    for (int i = 0; i < N; i++)
      for (int j = i+1; j < N; j++)
        for (int k = j+1; k < N; k++)
          if (arr[i] + arr[j] + arr[k] == 0){
            System.out.println("Triplet Found: " + arr[i] + " " + arr[j] + " " + arr[k] );
            count++;
            }
    // return count;
  }

  //Faster 3-sum approach
  public void fast3Sum(int[] arr) {
      int start, end;
      int counter = 0;

      // Search array from both endpoints
      for (int i = 0; i < arr.length - 2; i++) {
          start = i + 1;
          end   = arr.length - 1;
          while (start < end) {
              if (arr[i] + arr[start] + arr[end] == 0) {
                  System.out.println("Triplet found: " + arr[i] + ", " + arr[start] + ", " + arr[end]);
                  counter++;
                  break;
              }
              else if (arr[i] + arr[start] + arr[end] > 0)
                  end--;
              else
                  start++;
          }
      }
  }
  //Search based on 3sum hash table
  public void hash3Sum(int[] arr){
    int N = arr.length;
    int count = 0;
    for (int i = 0; i < N; i++)
      for (int j = i + 1; j < N; j++)
        for (int k = j + 1; k < N; k++)
          if (arr[i] + arr[j] + arr[k] == 0) {
            System.out.println("Triplet Found: " + arr[i] + " " + arr[j] + " " + arr[k] );
            count++;
          }
  }

  public static void main(String[] args) {
    Random r = new Random();
    int[] arrSize = {250, 500, 1000, 2000, 4000, 8000, 16000};
    int[] integers = new int[8000];
    for (int i = 0; i < integers.length; i++) {
      integers[i] = r.nextInt();
    }



    long startTime = System.nanoTime();
    long endTime = System.nanoTime();
    long elapsed = endTime - startTime;
    System.out.println(elapsed);
  }
}
