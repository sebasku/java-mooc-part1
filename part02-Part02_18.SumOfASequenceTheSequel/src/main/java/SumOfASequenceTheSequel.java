
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beginningNumber = Integer.valueOf(scanner.nextLine());
        int endingNumber = Integer.valueOf(scanner.nextLine());
        int sumOfNumbers = 0;
        for(; beginningNumber <= endingNumber; beginningNumber++){
            sumOfNumbers = sumOfNumbers + beginningNumber;
        }
        System.out.println("The sum is " + sumOfNumbers);
    }
}
