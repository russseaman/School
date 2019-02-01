import java.util.*;
import java.util.ArrayList;

public class Lec2Act1A{
  public static void main(String[] args) {
    List<Character> arrList = new ArrayList<Character>();
    for(char c : "ACHHIMNNPQXYK".toCharArray()) {
        arrList.add(c);
    }
    System.out.println("Array List before sorting:");
    System.out.println(arrList);
    System.out.println("Array List after sorting:");
    int countCurr = 0;
    while (arrList.size() > countCurr){
      if(arrList.get(countCurr+1) < arrList.get(countCurr)){
        arrList.set(arrList.get(countCurr),arrList.get(countCurr));
        // System.out.println("Less than A < B");
        // System.out.print(arrList.get(countCurr));
        // System.out.println(arrList.get(countCurr + 1));
      }
    //   else if (arrList.get(countCurr) == arrList.get(countCurr + 1)) {
    //     System.out.println("EQUAL A == B");
    //     System.out.print(arrList.get(countCurr));
    //     System.out.println(arrList.get(countCurr + 1));

    //   else{
    //     System.out.println("NOPE A > B");
    //     Item toMove = ArrayList(countCurr + 1);
    //     arrlist.set(countCurr, arrList.get(countCurr -1));
    //     arrList.set(countCurr -1, toMove);
    //   }
    //   countCurr++;
    // }
    // while (arrList.size() > count2){
    //   System.out.println(arrList.get(count2));
    //   count2++;
    // }
    System.out.println(arrList);
  }
  }
}
