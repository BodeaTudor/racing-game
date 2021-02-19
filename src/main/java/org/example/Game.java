package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Track[] tracks = new Track[3];
    private List<Vehicle> players = new ArrayList<>();
    // The difference between ArrayList<> and LinkedList is that ArrayList doesn't guarantee that the order of the elements
    // in the array is kept.
    // !!!SAME GOES FOR HashMap<> and SortedMap<>!!!
    // List and Set are collections the difference is that the elements from Set are unique.
    // Map<key, value> Example: Map<String, Vehicle> map = new HashMap<>() or new SortedMap<>().
    // Map is a collection of key-value pair.

    public void start() {
        initializeTracks();
        displayTracks();

        int playersCount = getPlayerCountFromUser();

        for (int i = 0; i < playersCount; i++) {
            addPlayers();
        }

        displayPlayers();
    }

    private void initializeTracks() {
        Track city = new Track();
        city.setName("City Track");
        city.setLength(300);

        tracks[0] = city;

        Track forest = new Track();
        forest.setName("Forest Track");
        forest.setLength(76);

        tracks[1] = forest;

        Track desert = new Track();
        forest.setName("Desert Track");
        forest.setLength(700);

        tracks[2] = desert;
    }

    private void displayTracks() {

        System.out.println("Available tracks:");

        //How to read a for loop:
        // "For an initial number int i = 0, as long as i is less than the length of the array (tracks.length), execute
        // the code between the brackets and at the end of every iteration, increment i with 1."
        // A for loop can be exited sooner with the keyword "break". Example:
        // if(i == 1){
        //    break;
        // }
        // An iteration can be skipped with the keyword "continue". Example:
        // if(i == 1){
        //    continue;
        // }

        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] != null) {
                System.out.println((i + 1) + ". " + tracks[i].getName());
            }
        }
    }

    private void addPlayers() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName(getVehicleNameFromUser());
        vehicle.setFuelLevel(60);
        vehicle.setMileage(ThreadLocalRandom.current().nextDouble(4.5, 20));
        vehicle.setMaxSpeed(200);

        players.add(vehicle);
    }

    private String getVehicleNameFromUser() {
        System.out.println("Please enter vehicle name for player: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private void displayPlayers() {
        System.out.println("Today's players are:");

        for (int i = 0; i < players.size(); i++) {
            if (players.get(i) != null) {
                System.out.println((i + 1) + ". " + players.get(i).getName() + " - mileage: " + players.get(i).getMileage());
            }
        }
    }

    private int getPlayerCountFromUser() {
        System.out.println("Please specify the number of players (use numbers only): ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
