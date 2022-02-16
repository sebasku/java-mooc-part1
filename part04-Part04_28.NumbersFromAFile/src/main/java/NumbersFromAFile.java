
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String file = scanner.nextLine();
        int lowerBound = Integer.valueOf(scanner.nextLine());
        int upperBound = Integer.valueOf(scanner.nextLine());
        int amountOfNumbers = 0;
        try(Scanner scannerFiles = new Scanner(Paths.get(file))){
            while(scannerFiles.hasNextLine()){
                int valueFromFile = Integer.valueOf(scannerFiles.nextLine());
                if(lowerBound <= valueFromFile && valueFromFile <= upperBound){
                    amountOfNumbers++;
                }
            }
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Numbers: " + amountOfNumbers);
    }

}
