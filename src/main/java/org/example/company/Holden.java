package org.example.company;

public class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }


    @Override
    public String startEngine() {
        System.out.println(this.getClass().getSimpleName() + "'s Car engine is starting");
        return super.startEngine();
    }

    public String accelerate() {
        return (this.getClass().getSimpleName() + " is accelerating");
    }

    public String brake() {
        return (this.getClass().getSimpleName() + " is breaking");
    }
}
