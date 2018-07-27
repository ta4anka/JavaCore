package net.proselyte.javacore.tutorial;

public class DeveloperRunner {
    public static void main(String[] args) {
        Developer javaDeveloper = new Developer();
        Developer cppDeveloper = new Developer();

        javaDeveloper.setSpeciality(Speciality.JAVA);
        cppDeveloper.setSpeciality(Speciality.CPP);

        System.out.println("Java Developer's Info: ");
        System.out.println(javaDeveloper);

        System.out.println("=======================");

        System.out.println("C++ Developer's Info");
        System.out.println(cppDeveloper);
    }
}
