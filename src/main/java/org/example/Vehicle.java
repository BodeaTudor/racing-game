package org.example;

public class Vehicle {

    private String name;
    private double mileage;
    private String color;
    private double maxSpeed;
    private boolean running;
    private double fuelLevel;
    private double traveledDistance;

    /**
     * method syntax:
     * 1. access modifier = public, protected, default(package-private), private
     * 2. return type = String, double, int, void, objects etc.
     * 3. method name
     * 4. method parameters
     * 5. after {} method implementation
     */

    public double accelerate(double speed, double durationInHours) {
        //concatenation
        System.out.println(name + " is accelerating with " + speed + " km/h for " + durationInHours + " h.");

        System.out.println(name + " is accelerating with " + speed + " km/h for " + durationInHours + " h.");

        double distance = speed * durationInHours;
        System.out.println("Traveled " + distance + " km.");

//        traveledDistance = traveledDistance + distance;
//        same result as the above statement
        traveledDistance += distance;
        System.out.println("Total traveled distance: " + traveledDistance + " km.");

        double spentFuel = distance / 100 * mileage;
        System.out.println("Spent fuel: " + spentFuel + " l.");

//        fuelLevel = fuelLevel - spentFuel;
        fuelLevel -= spentFuel;
        System.out.println("Remained fuel: " + fuelLevel + " l.");
        return distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTraveledDistance() {
        return traveledDistance;
    }

    public void setTraveledDistance(double traveledDistance) {
        this.traveledDistance = traveledDistance;
    }
}
