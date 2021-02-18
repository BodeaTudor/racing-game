package org.example;

public class AutoVehicle extends Vehicle {

    //"has-a" relationship
    private Engine engine;

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

    //constructor overloading
    public AutoVehicle() {
        //this.engine = new Engine;
        //this() - means constructor of the current class
        this(new Engine());
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "AutoVehicle{" +
                "engine=" + engine +
                '}';
    }
}
