
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        int amountOfNumbers = 0;
        int sumOfNumbers = 0;
        int amountOfEven = 0;
        int amountOfOdd = 0;
        
        System.out.println("Give numbers:");
        while(true){
            int value = Integer.valueOf(scanner.nextLine());
            
            if(value == -1){
                System.out.println("Thx! Bye!");
                break;
            }
            
            sumOfNumbers = sumOfNumbers + value;
            amountOfNumbers++;
            
            if(value % 2 == 0){
                amountOfEven++;
            } else {
                amountOfOdd++;
            }
        }
        System.out.println("Sum: " + sumOfNumbers);
        System.out.println("Numbers: " + amountOfNumbers);
        System.out.println("Average: " + (1.0 * sumOfNumbers/amountOfNumbers));
        System.out.println("Even: " + amountOfEven);
        System.out.println("Odd: " + amountOfOdd);
    }
}
