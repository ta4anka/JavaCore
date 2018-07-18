package net.proselyte.javacore.Schildt.Chapter_5;

public class MySearch {
    public static void main(String [] args){
        int[] nums = {3,4,5,6,78,98,1,23};
        int val = 98;
        for(int i= 0;i<nums.length;i++){
            if(nums[i] == val){
                System.out.println("Value is found, index is " + i);
                break;

            }
        }

    }
}
