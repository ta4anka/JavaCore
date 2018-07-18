package net.proselyte.javacore.Schildt.Chapter_5;



public class MyContinue {

    public static void main (String [] args) {

        for (int i = 1; i <= 7; i++){
            System.out.println(i + ": It's before continue!");
            if (i > 2)
                continue;//return in the for loop!!!
            System.out.println("     "+ i + ": It's only two times;(");
        }
    }
}

/*

1: It's before continue!
     1: It's only two times;(
2: It's before continue!
     2: It's only two times;(
3: It's before continue!
4: It's before continue!
5: It's before continue!
6: It's before continue!
7: It's before continue!

 */