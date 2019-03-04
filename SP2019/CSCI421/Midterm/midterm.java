public class midterm {

    public static void selectSort(String[] stringIN) {
        char[] charArr;

        for (int i = 0; i < stringIN.length; i++) {
            charArr = stringIN[i].toCharArray();
            for (int j = 0; j < charArr.length; j++) {
                int min = j;
                for (int k = j + 1; k < charArr.length; k++) {
                    if (less(charArr[k], charArr[min]))
                        min = k;
                }
                exch(charArr, j, min);
                stringIN[i] = String.valueOf(charArr);
            }
        }

        System.out.println("Array after sorting: ");
        for (int i = 0; i < stringIN.length; i++) {
            int min = i;
            for (int j = i + 1; j < stringIN.length; j++) {
                if (lessString(stringIN[j], stringIN[min]))
                    min = j;
            }
            exchStr(stringIN, i, min);
        }

        for (int i = 0; i < stringIN.length; i++)
            System.out.println(stringIN[i] + "");

        int count = 0;
        for (int i = 0; i < stringIN.length; i++)
            if (i == 0)
                count++;
            else if (!stringIN[i].equals(stringIN[i - 1]))
                count++;

        System.out.println("Found " + count + " Distinct elements");

    }

    private static boolean less(Character v, Character w) {
        return v.compareTo(w) < 0;
    }

    private static boolean lessString(String v, String w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(char[] c, int i, int j) {
        char swap = c[i];
        c[i] = c[j];
        c[j] = swap;
    }

    private static void exchStr(String[] s, int i, int j) {
        String swap = s[i];
        s[i] = s[j];
        s[j] = swap;
    }

    public static void main(String[] args) {
        String[] stringIN = { "acb", "ccc", "cba", "bca", "aaa", "bbb", "aab" };

        System.out.println("Unsorted array: ");

        for (int i = 0; i < stringIN.length; i++)
            System.out.println(stringIN[i] + " ");

        long startTime = System.currentTimeMillis();
        selectSort(stringIN);
        long endTime = System.currentTimeMillis();
        long elapsed = endTime - startTime;
        System.out.println("Elapsed time : " + elapsed);
    }

}