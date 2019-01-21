public class Driver {
    public static void main(String[] args) {
        int arr1[] = {-25, -10, -7, -3, 2, 4, 8, 10};
        int arr2[] = {-10, -7, 25, 2, -3, 4, 10, 8};
        ThreeSum ts = new ThreeSum();
        ThreeSumHash tsh = new ThreeSumHash();

        System.out.println("---WITHOUT HASH/SORTED---");
        ts.count(arr1);
        System.out.println("---WITH HASH/UNSORTED---");
        tsh.count(arr2);
    }
}
