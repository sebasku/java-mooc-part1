
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        String userInput = scanner.nextLine();
        // Write your program here
        for(int i = 0; i<3; i++){
            System.out.println(userInput);
        }

    }
}
