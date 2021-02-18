package org.example;

public class Vehicle {

    String name;
    double mileage;
    String color;
    double maxSpeed;
    boolean running;
    double fuelLevel;
    double traveledDistance;


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
}
