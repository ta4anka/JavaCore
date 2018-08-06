package net.proselyte.javacore.mystudy;

public class AboutEquals {
    public static void main(String[] args) {
        Animals animal1 = new Animals(1);
        Animals animal2 = new Animals(1);
        System.out.println(animal1.equals(animal2));
    }
}

class Animals{
    private int id;

    public Animals(int id){
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        Animals otherAnimals = (Animals) o;
        return this.id == otherAnimals.id;
    }
}