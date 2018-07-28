package net.proselyte.javacore.tutorial;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {
    public static void main(String[] args) {
        Date currentDate = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("'Date: 'E dd.MM.yyyy'\nTime: ' hh:mm:ss a zzz");
        System.out.println("Current date: " + currentDate.toString());
        System.out.println("Formatted current date:\n" + dateFormat.format(currentDate));
    }
}

/*
    Current date: Sat Jul 28 19:04:32 EEST 2018
        Formatted current date:
        Date: Sat 28.07.2018
        Time:  07:04:32 PM EEST
 */
