package net.proselyte.javacore.tutorial;

public class DeveloperRunner2 {
    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper("Java Man");

        System.out.println(javaDeveloper);

        System.out.println("Java Developer's methods: ");
        javaDeveloper.breath();
        javaDeveloper.writeCode();
        javaDeveloper.enjoyLife();
    }
}
