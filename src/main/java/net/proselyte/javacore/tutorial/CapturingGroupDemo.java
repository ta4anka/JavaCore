package net.proselyte.javacore.tutorial;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapturingGroupDemo {
    public static void main(String[] args) {
        String inputString = "This is simple that contains phone number +380505055050 That's great.";
        String pattern = "(\\d+)";

        Pattern ptrn = Pattern.compile(pattern);
        Matcher matcher = ptrn.matcher(inputString);

        if(matcher.find()){
            System.out.println("Phone number: " + matcher.group(0));
        }else {
            System.out.println("PHONE NUMBER NOT FOUND");
        }
    }
}


// Phone number: 380505055050