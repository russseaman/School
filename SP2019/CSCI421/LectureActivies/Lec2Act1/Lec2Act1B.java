import java.util.Arrays;

class Lec2Act1B {
    public static void main(String[] args) {
        final int[] arrList = {36, 26, 10, 15, 19, 76, 69, 42, 105,27, 57};

        new Lec2Act1B().sort(arrList);

        for(int i=0; i<arrList.length; i++)
            System.out.print(arrList[i]+" ");
    }

    public void sort(int array[]) {
        for (int i = 1; i < array.length; i++){
            int x = array[i];

            int j = Math.abs(Arrays.binarySearch(array, 0, i, x) + 1);

            System.arraycopy(array, j, array, j+1, i-j);

            array[j] = x;
        }
    }
}
