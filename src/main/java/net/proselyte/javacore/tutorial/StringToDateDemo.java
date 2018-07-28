package net.proselyte.javacore.tutorial;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateDemo {
    public static void main(String[] args) throws ParseException {
        String string = args.length == 0?"28-07-2018": args[0];
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-yyyy");
        Date date;

        date = dateFormat.parse(string);
        System.out.println("We transform string: " + string + " to: ");
        System.out.println(date);
    }
}
