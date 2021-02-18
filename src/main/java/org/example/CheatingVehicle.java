package org.example;

public class CheatingVehicle extends Vehicle{

    /**
     * When overriding a method from a class that is a child of a superclass you can do the following with the method signature:
     * - enlarge the access-modifier for example if the parent gives "protected" access you can only enlarge it to "public"
     * but you can't restrain it to "private"
     * - CO-VARIANT RETURN TYPE - with the return type for example if the superclass is returning a Vehicle you can return
     * a Car but you cannot return a String or something that has no business with Vehicle
     * - if the method overridden throws an Exception you can override the methods throwed exception only if the exception
     * is not enlarged you can only restrain it
     * !!! OVERRIDING APPLIES ONLY FOR METHODS AND ONLY IN THE CONTEXT OF INHERITANCE !!!
     */

    @Override
    public double accelerate(double speed, double durationInHours) {

        System.out.println(getName() + " is accelerating with " + speed + " km/h for " + durationInHours + " h.");

        double distance = speed * durationInHours * 2;
        System.out.println("Traveled " + distance + " km. Cheater!");

        setTraveledDistance(getTraveledDistance() + distance);
        System.out.println("Total traveled distance: " + getTraveledDistance() + " km.");

        System.out.println("This vehicle has infinite fuel!");
        return distance;
    }
}
