package net.proselyte.javacore.mystudy;

import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        do{
            System.out.println("Enter a world 'apple': ");
            word = scanner.next();

        }while(!word.equals("apple"));
        System.out.println("You entered the word 'apple' ");
    }
}
