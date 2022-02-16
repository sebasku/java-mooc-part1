
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.valueOf(scanner.nextLine());
        int sumOfNumbers = 0;
        for(int i = 1; i <= number; i++){
            sumOfNumbers = sumOfNumbers + i;
        }
        System.out.println("The sum is " + sumOfNumbers);
    }
}
