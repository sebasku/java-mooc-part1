
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfFile = scanner.nextLine();
        
        try(Scanner fileScanner = new Scanner(Paths.get(nameOfFile))){
            while(fileScanner.hasNextLine()){
                String oneLine = fileScanner.nextLine();
                System.out.println(oneLine);
            }
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
