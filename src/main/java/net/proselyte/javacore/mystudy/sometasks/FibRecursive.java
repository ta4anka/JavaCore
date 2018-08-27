package net.proselyte.javacore.mystudy.sometasks;

public class FibRecursive {
    public static void main(String[] args) {
        FindFib fb = new FindFib();
        System.out.println(fb.findN(20)); // 6765
    }

}class FindFib {
    int n;

    public int findN(int n){
        if(n <= 1) return n;
        else
            return findN(n -1 ) + findN(n - 2 );
    }
}