package org.example;

public class AutoVehicle extends Vehicle {

    //"has-a" relationship
    Engine engine;

    /**
     * constructor syntax:
     * 1. access modifier = public, protected, default(package-private), private
     * 2. class name
     * 3. parameters list
     * 3. after {} implementation
     */

    public AutoVehicle(Engine engine) {
        this.engine = engine;
    }

    
}
