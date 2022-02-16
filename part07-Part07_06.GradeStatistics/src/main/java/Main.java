
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        GradingSystem gradingSystem = new GradingSystem();
        UserInterface userInterface = new UserInterface(scanner, gradingSystem);
        userInterface.start();
    }
}
