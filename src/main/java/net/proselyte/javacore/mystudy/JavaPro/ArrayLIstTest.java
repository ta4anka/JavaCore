package net.proselyte.javacore.mystudy.JavaPro;

import java.util.ArrayList;
import java.util.List;

public class ArrayLIstTest {
    public static void main(String[] args) {
/*        int [] x = new int[3];
        for(int i = 0; i < 4; i++)
            x[i] = i;   ==> ArrayIndexOutOfBoundsException
*/
        List<Integer> arrayList = new ArrayList<>(); //Convention! ArrayList ==> List
        for(int i = 0; i < 20; i++)
            arrayList.add(i);
        System.out.println(arrayList);

        //get():
        System.out.println(arrayList.get(12));
        //size():
        System.out.println(arrayList.size());

        //go through all the elements
        //1) for loop:
        for(int i = 0; i < arrayList.size(); i++)
            System.out.print(arrayList.get(i) + " ");

        System.out.println();
        // for each loop:
        for(Integer x: arrayList)
            System.out.print(x + " ") ;

        System.out.println();
        //remove();
        arrayList.remove(0);
        System.out.println(arrayList);
    }
}
