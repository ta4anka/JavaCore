package net.proselyte.javacore.mystudy;

import java.util.Scanner;

public class UsingScanner {
    public static void main(String[] args) {

//int  --> nextInt()
        System.out.println("Enter your number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("\n");
//double --> nextDouble()
        System.out.println("Enter your double number: ");
        Scanner scan2 = new Scanner(System.in);
        double number2 = scan2.nextDouble();
        System.out.println( number2  +"\n");

// String --> nextLine()
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word or phrase: ");
        String phrase = sc.nextLine();
        System.out.println(phrase);

 //String before first space --> next()
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter your word or phrase: ");
        String phrase2 = sc2.next();
        System.out.println(phrase2);



    }
}


