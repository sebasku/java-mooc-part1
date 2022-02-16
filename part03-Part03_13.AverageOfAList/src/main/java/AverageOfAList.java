
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == -1){
                break;
            }
            numbers.add(number);
        }
        System.out.println("");
        
        int sumOfNumbers = 0;
        
        for(int index = 0; index < numbers.size(); index++){
            sumOfNumbers = sumOfNumbers + numbers.get(index);
        }
        
        System.out.println("Average: " + (1.0*sumOfNumbers/(numbers.size())));
    }
}
