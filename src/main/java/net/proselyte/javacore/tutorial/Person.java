package net.proselyte.javacore.tutorial;

public class Person {
    private String name;


    //Default constructor:
    public Person() {
        }


    //Constructor with parameter
    public Person(String name) {
        this.name = name;


    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
