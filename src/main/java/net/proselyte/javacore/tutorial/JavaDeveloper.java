package net.proselyte.javacore.tutorial;

public class JavaDeveloper implements Developer2,Human {
    private String name;

    public JavaDeveloper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void writeCode() {
        System.out.println("Java developer writes java Code...");
    }

    @Override
    public void enjoyLife() {
        System.out.println("Java developer enjoys Life...");
    }

    @Override
    public void breath() {
        System.out.println("Breathing like a human...");

    }


    @Override
    public String toString() {
        return "JavaDeveloper" +
                "\nname:'" + name + '\'';
    }
}
