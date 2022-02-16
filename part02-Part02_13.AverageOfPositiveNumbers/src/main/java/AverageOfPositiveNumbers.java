
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int amountOfNumbers = 0;
        int sumOfNumbers = 0;
        
        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 0){
                break;
            } else if(number > 0){
                sumOfNumbers = sumOfNumbers + number;
                amountOfNumbers = amountOfNumbers + 1;
            }
        }
        if(amountOfNumbers <= 0){
            System.out.println("Cannot calculate the average");
        } 
        System.out.println(1.0 * sumOfNumbers/amountOfNumbers);
    }
}
