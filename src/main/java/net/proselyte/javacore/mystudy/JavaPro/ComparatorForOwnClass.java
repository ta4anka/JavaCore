package net.proselyte.javacore.mystudy.JavaPro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorForOwnClass {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(4,"Mike"));
        people.add(new Person(3,"Katy"));
        people.add(new Person(1,"Bob"));

        Collections.sort(people,new Comparator<Person>(){
            @Override
            public int compare(Person person, Person t1) {
                if(person.getId() > t1.getId())return 1;
                else if(person.getId() < t1.getId()) return -1;
                else return 0;
            }
        });

        System.out.println(people);
    }
}

class Person  {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
