package net.proselyte.javacore.tutorial;

public abstract class Beast {
    private String beastName;

    public Beast(String beastName) {
        this.beastName = beastName;
    }

    public abstract void toBreath();
    public abstract void toEat();
}
