import java.util.Random;

public class Lec2Act3_2 {
    public static void main(String[] args) {
        priorityQueue<Comparable> pq = new priorityQueue<Comparable>();
        int size = 8000;
        int arr[] = new int[size];
        int item = 0;

        for (int i = 0; i < size; i++) {
            item = (int) (Math.random() * 100);
            arr[i] = item;
        }

        long startTime, endTime, elapsed;

        System.out.println("For Array Size: " + size);
        startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            pq.insert(arr[i]);
            while( i < arr.length/2){
                pq.delMax();
                i++;
            }
        }
        endTime = System.currentTimeMillis();
        elapsed = endTime - startTime;
        System.out.println("QuickSort Time: " + elapsed);

    }
}