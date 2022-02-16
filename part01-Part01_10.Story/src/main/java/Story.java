
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("I will tell you a story, but I need some information first.\n" + "What is the main character called?");
        String firstAnswer = scanner.nextLine();
        System.out.println("What is their job?");
        String secondAnswer = scanner.nextLine();
        System.out.println("Here is the story:\nOnce upon a time there was " + firstAnswer +", who was " + secondAnswer +".\n" +
"On the way to work, " + firstAnswer +" reflected on life.\n" +
"Perhaps " + firstAnswer +" will not be " + secondAnswer +" forever.");
    }
}
