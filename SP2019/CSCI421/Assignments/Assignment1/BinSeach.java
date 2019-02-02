import java.util.Arrays;
import java.util.Scanner;

public class BinSearch{
  public static int binarySearch(int[] a, int key){
    int lo = 0, hi = a.length-1;
    while (lo <= hi){
      int mid = lo + (hi - lo) / 2;
      if (key < a[mid]) hi = mid - 1;
      else if (key > a[mid]) lo = mid + 1;
      else return mid;
    }
    return -1;
  }


  // public static void main(String [] args){
  //   int[] searchArray = {18,17,14,9,6,5,1,-5,-9,-17,-22,-25,-20,-18,-10,-7,-3,0,2,4,8,10,15,16};
  //   Arrays.sort(searchArray);
  //
  //   System.out.println("Was the value found in the array? " + binarySearch(searchArray, 18));
  //
  //   }
}
