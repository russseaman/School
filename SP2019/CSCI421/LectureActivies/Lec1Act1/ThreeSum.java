public class ThreeSum {
  public static int count(int[] a){
    int N = a.length;
    int count = 0;
    for (int i = 0; i < N; i++)
      for (int j = i+1; j < N; j++)
        for (int k = j+1; k < N; k++)
          if (a[i] + a[j] + a[k] == 0){
            System.out.println("Triplet Found: " + a[i] + " " + a[j] + " " + a[k] );
            count++;
            }
    return count;
  }

  public static void main(String[] args){
    int arr1[] = {-25, -10, -7, -3, 2, 4, 8, 10};
    System.out.println("For the array: ");
    for(int i = 0; i < arr1.length; i++){
      System.out.print(arr1[i] + " ");
    }
    System.out.println();
    System.out.println("Total triplets found: " + count(arr1));
  }
}
