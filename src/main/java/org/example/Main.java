package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.company.Car;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        CarSkeleton newElectricCar = new ElectricCar("Electric 1", "runs on electric", 5, 23
        );
        System.out.println(newElectricCar.startEngine());
    }
}