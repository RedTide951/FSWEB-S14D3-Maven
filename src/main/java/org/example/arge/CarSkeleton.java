package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public CarSkeleton() {
        this.name = "name";
        this.description = "description";
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine() {
        return (getClass().getSimpleName() + "'s engine is starting");
    }

    private String runEngine() {
        return (getClass().getSimpleName() + "'s engine is being run");
    }

    public String drive() {
        System.out.println(runEngine());
        return (getClass().getSimpleName() + " is being driven");
    }





}
