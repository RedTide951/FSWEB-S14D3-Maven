package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
         return "the car's engine is starting";
    }

    public String accelerate() {
        return "the car is accelerating";
    }

    public String brake() {
        return "the car is braking";
    }

    @Override
    public boolean equals(Object obj) {
        if (this.name.equals(((Car)obj).name) && this.cylinders == ((Car)obj).cylinders) {
            return true;
        } else {
            return false;
        }
    }
}
