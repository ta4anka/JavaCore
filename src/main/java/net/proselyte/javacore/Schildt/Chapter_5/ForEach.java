package net.proselyte.javacore.Schildt.Chapter_5;

// Use a for-each style for loop
public class ForEach {
    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
// use for-each style for to display and sum the values
        for(int x : nums) {
            System.out.println("Value is: " + x);
            sum += x; // the same ==> for(int i=0; i < 10; i++) sum += nums[i];
        }
        System.out.println("Summation: " + sum);
    }
}
