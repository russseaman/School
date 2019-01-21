import java.util.HashMap;
import java.util.Map;

public class ThreeSumHash {

    public void count(int[] arr) {
        Map<Integer, int[]> map = new HashMap<Integer, int[]>();
        int counter = 0;
        int[] arr_result;

        for (int i = 0; i < arr.length; i++) {
            map.clear();
            for (int j = i + 1; j < arr.length; j++) {
                if (map.containsKey(arr[j])) {
                    int[] triplet = map.get(arr[j]);
                    arr_result = new int[]{triplet[0], triplet[1], arr[j]};
                    print_arr(arr_result);
                    counter++;
                }
                else
                    map.put(-arr[i] - arr[j], new int[]{arr[i], arr[j]});
            }
        }
        System.out.println("Total triplets: " + counter);
    }

    public void print_arr(int[] arr) {
        System.out.print("Triplet found: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
