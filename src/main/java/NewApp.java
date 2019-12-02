import java.util.Scanner;

public class NewApp {
    public static void main (String[] args ) {
        System.out.println("Please enter the greeting");
        System.out.println("You said" + Worker.setGreeting() + "so have a nice day, mate!");
    }
}

class Worker {
    static String setGreeting() {
        Scanner track = new Scanner(System.in);
        return track.nextLine();
    }
}
