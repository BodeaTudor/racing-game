package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
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

    public void start() throws Exception {
        initializeTracks();
        displayTracks();

        Track selectedTrack = getTrackSelectedByUser();

        int playersCount = getPlayerCountFromUser();

        for (int i = 0; i < playersCount; i++) {
            addPlayers();
        }

        displayPlayers();

        boolean winnerNotKnown = true;
        int playersWithoutFuel = 0;

        //do-while loop
//        Used when we want to execute at least once the instructions given. Example:
//        do{
//            System.out.println("DoingSomething");
//        }while (winnerNotKnown etc.);
        while (winnerNotKnown && playersWithoutFuel < players.size()) {
            //enhanced for or for-each
            // How to read it:
            // "For each player of type Vehicle from the list players execute code from brackets."
            // With for-each you cannot enter infinite loop
            for (Vehicle player : players) {
                player.accelerate(getSpeedFromUser());

                if (player.getTraveledDistance() >= selectedTrack.getLength()) {
                    System.out.println("Congrats! the winner is: " + player.getName());
                    winnerNotKnown = false;
                    break;
                }

                if (player.getFuelLevel() <= 0) {
                    playersWithoutFuel++;
                }
            }
        }
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

    private Track getTrackSelectedByUser() {
        System.out.println("Please choose a track (enter the number of the track):");
        try {
            Scanner scanner = new Scanner(System.in);
            int trackNumber = scanner.nextInt();
            Track track = tracks[trackNumber - 1];
            System.out.println("Selected track: " + track.getName());
            return track;
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("You entered an invalid track number. Please try again...");
            //recursion - a method invoking itself
            return getTrackSelectedByUser();
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

    private int getPlayerCountFromUser() throws Exception {
        System.out.println("Please specify the number of players (use numbers only): ");
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new Exception("You entered an invalid value. Please restart the game!");
//        }catch (RuntimeException e){
//            return 0;
//        }finally {
//            System.out.println("Always executed");
//        }
//            It is recommended when we catch an exception to refine the threads by specifying how should each exception
//            behave
//        } finally {
//            //finally block is always executed
//            System.out.println("Read input from user.");
//        }
//        return getPlayerCountFromUser();
        }
    }

    private double getSpeedFromUser() {
        System.out.println("Please enter acceleration speed:");
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("You entered an invalid value. Please try again...");
            return getSpeedFromUser();
        }
    }
}
