
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> numbers = new ArrayList<>();
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 9999){
                break;
            }
            numbers.add(number);
        }
        int storeNumber = 9999;
        ArrayList<Integer> indexes = new ArrayList<>();
        for(int index = 0; index < numbers.size(); index++){
            if(storeNumber > numbers.get(index)){
                storeNumber = numbers.get(index);
                indexes.add(index);
            }
        }
        System.out.println("Smallest number: " + storeNumber);
        for(int index = 0; index < indexes.size(); index++){
            System.out.println("Found at index: " + indexes.get(index));
        }
        
    }
}
