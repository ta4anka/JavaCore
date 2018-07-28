package net.proselyte.javacore.tutorial;

import java.util.Date;

public class DateAndTimeDemo {
    public static void main(String[] args) {
        /*Creating Date object with Current Date and Time*/
        Date currentDate = new Date();


        System.out.println("Current date and time: " + currentDate.toString());
        System.out.println("Using getTime() \'method\': " + currentDate.getTime());

        Date someDate = new Date();
        System.out.println("Some date: " + someDate.toString());
        System.out.println("Compare dates: ");
        System.out.println("Current date and some date are equal: " + currentDate.equals(someDate));

    }
}

/*
    Current date and time: Sat Jul 28 19:02:36 EEST 2018
        Using getTime() 'method': 1532793756538
        Some date: Sat Jul 28 19:02:36 EEST 2018
        Compare dates:
        Current date and some date are equal: false
 */
