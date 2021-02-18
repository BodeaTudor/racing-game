package org.example;

//inheritance or "is-a" relationship
public class Car extends AutoVehicle {

    private int doorCount;

    public Car(Engine engine) {
        super(engine);
    }

    public Car() {
        //super(); it would be the same if "super()" was there but,
        //any constructor will try to call the "no-parameter" constructor of the parent class
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }
}
