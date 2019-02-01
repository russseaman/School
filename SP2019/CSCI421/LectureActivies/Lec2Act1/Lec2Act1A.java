class Lec2Act1A{
    void sort(int arrList[]){
        int n = arrList.length;
        for (int i=1; i<n; ++i){
            int key = arrList[i];
            int j = i-1;

            while (j>=0 && arrList[j] > key){
                arrList[j+1] = arrList[j];
                j = j-1;
            }
            arrList[j+1] = key;
        }
    }

    static void printArray(int arrList[]){
        int n = arrList.length;
        for (int i=0; i<n; ++i)
            System.out.print(arrList[i] + " ");
        System.out.println();
    }

    public static void main(String args[]){
        int arrList[] = {36, 26, 10, 15, 19, 76, 69, 42, 105,27, 57};
        Lec2Act1A ob = new Lec2Act1A();
        ob.sort(arrList);

        printArray(arrList);
    }
}
