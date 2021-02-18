package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Engine engine = new Engine();
        engine.manufacturer = "Renault";

        Car car = new Car(engine);
        car.name = "Car";
        car.doorCount = 4;
        car.mileage = 9.5;
        car.color = "red";
        car.maxSpeed = 100;
        car.running = true;
        car.fuelLevel = 50;


        car.engine = engine;

        System.out.println(car.engine.manufacturer);

        Car car2 = new Car(engine);
        car2.name = "Car2";
        car2.doorCount = 2;
        car2.mileage = 15;
        car2.color = "black";
        car2.maxSpeed = 150;
        car2.running = true;
        car2.fuelLevel = 60;

        Car car3 = car;

        System.out.println(car.name);
        System.out.println(car3.name);

        System.out.println("Changing values...");

        car.name = "Changed value";

        System.out.println(car.name);
        System.out.println(car3.name);

        System.out.println(car.maxSpeed);
        System.out.println(car.engine);

        double distance = car.accelerate(60, 1);
        System.out.println("Distance in App.main: " + distance);
    }
}
