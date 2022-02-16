
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countValue = 0;
        while(true){
            System.out.println("Give a number:");
            int valueFromUser = Integer.valueOf(scanner.nextLine());
            if(valueFromUser == 0){
                break;
            }
            countValue = countValue + 1;
        }
        System.out.println("Number of numbers: " + countValue);
    }
}
