package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {

        Game game = new Game();
        game.start();
//        Engine engine = new Engine();
//        engine.setManufacturer("Renault");
//
//        Car car = new Car(engine);
//        car.setName("Car");
//        car.setDoorCount(4);
//        car.setMileage(9.5);
//        car.setColor("red");
//        car.setMaxSpeed(100);
//        car.setRunning(true);
//        car.setFuelLevel(50);
//
//
//        car.setEngine(engine);
//
//        System.out.println(car.getEngine().getManufacturer());
//
//        Car car2 = new Car(engine);
//        car2.setName("Car2");
//        car2.setDoorCount(2);
//        car2.setMileage(15);
//        car2.setColor("black");
//        car2.setMaxSpeed(150);
//        car2.setRunning(true);
//        car2.setFuelLevel(60);
//
//        Car car3 = car;
//
//        System.out.println(car.getName());
//        System.out.println(car3.getName());
//
//        System.out.println("Changing values...");
//
//        car.setName("Changed value");
//
//        System.out.println(car.getName());
//        System.out.println(car3.getName());
//
//        System.out.println(car.getMaxSpeed());
//        System.out.println(car.getEngine());
//
//        double distance = car.accelerate(60, 1);
//        System.out.println("Distance in App.main: " + distance);

        //demo for static variables(class variables)
//        System.out.println("Studying static variables:");
//        car.totalCount = 1;
//        System.out.println("Total count from car: " + car.totalCount);
//
//        car2.totalCount = 2;
//        System.out.println("Total count from car after setting car2: " + car.totalCount);
//        System.out.println("Total count from car2: " + car2.totalCount);
//        System.out.println("Total count from Vehicle class: " + Vehicle.totalCount);

        //method overloading
//        car2.accelerate(100);
//        car.accelerate(100, 3);

        //constructor overloading
//        new AutoVehicle(engine);
//        new AutoVehicle();

        //overriding toString method
//        System.out.println(car);

        //overriding
//        CheatingVehicle cheater = new CheatingVehicle();
//        cheater.setName("Car2");
//        cheater.setColor("black");
//        cheater.setMaxSpeed(500);
//        cheater.setRunning(true);
//
//        cheater.accelerate(60, 1);
//        car.accelerate(60, 1);

        //polymorphism
//        Vehicle cheater2 = new CheatingVehicle();
//        cheater2.setName("Cheater!");
//        cheater2.setColor("blue");
//        cheater2.setMaxSpeed(500);
//        cheater2.setRunning(true);
//        cheater2.accelerate(30, 2);
//
//        Vehicle testCar = new Car();
        //type-casting
//        ((Car) testCar).getDoorCount();

        //comparing objects
//        String a = "test";
//        String b = "test";
//        String c = new String("test");
//
//        System.out.println(a == b);
//        System.out.println(a == c);
//        System.out.println(a.equals(c));
//
//        Vehicle vehicle1 = new Vehicle();
//        vehicle1.setName("Dacia");
//
//        Vehicle vehicle2 = new Vehicle();
//        vehicle1.setName("Dacia");
//
//        System.out.println(vehicle1 == vehicle2);
//        System.out.println(vehicle1.equals(vehicle2));
    }
}
