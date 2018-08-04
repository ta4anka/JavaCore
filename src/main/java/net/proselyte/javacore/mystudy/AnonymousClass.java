package net.proselyte.javacore.mystudy;

class Animal{
    public void eat(){
        System.out.println("Animal is eating...");
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Animal animal2 = new Animal(){// animal2 is an instance of anonymous class
            public void eat(){
                System.out.println("Other animal is eating...");
                }
        };
        animal2.eat();

    }
}
