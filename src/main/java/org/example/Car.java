package org.example;

//inheritance or "is-a" relationship
public class Car extends AutoVehicle {

    int doorCount;
    
    public Car(Engine engine) {
        super(engine);
    }
}
