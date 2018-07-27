package net.proselyte.javacore.tutorial;

public class Cat extends Beast {
    private String color;

    public Cat(String beastName, String color) {
        super(beastName);  // this.beastName = beastName from Beast
        this.color = color;
    }

    @Override
    public void toBreath() {
        System.out.println("Cat uses lungs for breathing");
    }

    @Override
    public void toEat() {
        System.out.println("Cat eats fish.");
    }
}


