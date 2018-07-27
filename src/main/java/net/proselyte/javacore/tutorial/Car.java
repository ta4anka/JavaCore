package net.proselyte.javacore.tutorial;

public class Car {
    String type;

    //Getter
    public String getType() {
        return type;
    }

    //Setter
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                '}';
    }
}
