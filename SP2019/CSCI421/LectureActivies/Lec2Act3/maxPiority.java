import java.util.Random;

public class PQtester {

    public static void main(String[] args) {

        MaxPQ<Integer> pq = new MaxPQ<Integer>();

        int testCount = 5; // 5 values for N

        long time;

        long totalTime = 0;

        int N = 10;

        while (testCount > 0) {

            long start = System.nanoTime(); // get start time

            int i = 0;

            Random rand = new Random(); // Get random value to insert

            while (i < N) {

                int item = rand.nextInt(100);

                pq.insert(item);

                i++;

            }

            i = 0;

            while (i < N / 2) {

                pq.delMax();

                i++;

            }

            long end = System.nanoTime(); // get end time

            time = end - start; // Calculate time

            totalTime = totalTime + time;

            System.out.println("\nN\t=" + N);

            System.out.println("time\t=" + time + " Neno Second");

            N = N * 10;

            testCount--;

        }

        System.out.println("Average Time\t=" + totalTime / 5 + " Neno Second"); // Printing average time

    }

}