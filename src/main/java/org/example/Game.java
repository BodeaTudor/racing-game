package org.example;

public class Game {

    private Track[] tracks = new Track[3];

    public void start() {
        initializeTracks();
        displayTracks();
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
}
