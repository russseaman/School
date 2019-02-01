public class ThreeSumImp {

    // Assumes array being passed in is already sorted
    public void count(int[] arr) {
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
        System.out.println("Total triplets: " + counter);
    }
}
