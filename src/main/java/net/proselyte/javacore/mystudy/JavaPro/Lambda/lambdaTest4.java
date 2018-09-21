package net.proselyte.javacore.mystudy.JavaPro.Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Using lambda with Comparator
public class lambdaTest4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("user");
        list.add("Vladimir");
        list.add("w");
        list.add("ccc");

//--------------without lambda(anonymous Class)----------------:

/*         list.sort(new Comparator<String>() {
             @Override
             public int compare(String s, String t1) {
                 if(s.length() > t1.length()){
                     return 1;
                 }else if(s.length() < t1.length()){
                     return -1;
                 }else {
                     return 0;
                 }
             }
         });
*/

//--------------with lambda-------------------:
        list.sort((s1,s2)->{
            if(s1.length() > s2.length())return 1;
            else if(s1.length() < s2.length())return -1;
            else return 0;
            });

        System.out.println(list);














    }
}
