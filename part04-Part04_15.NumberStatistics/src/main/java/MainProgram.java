
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        System.out.println("Enter numbers:");
        Statistics allNumbers = new Statistics();
        Statistics evenNumbers = new Statistics();
        Statistics oddNumbers = new Statistics();
        
        
        while(true){
            int value = Integer.valueOf(scanner.nextLine());
            if(value == -1){
                break;
            }
            allNumbers.addNumber(value);
            if(value % 2 == 0){
                evenNumbers.addNumber(value);
            } else {
                oddNumbers.addNumber(value);
            }
        }
        System.out.println("Sum: " + allNumbers.sum());
        System.out.println("Sum of even numbers: " + evenNumbers.sum());
        System.out.println("Sum of odd numbers: " + oddNumbers.sum());        
    }
}
