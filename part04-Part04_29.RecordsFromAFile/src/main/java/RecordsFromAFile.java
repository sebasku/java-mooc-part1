
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String nameOfFile = scanner.nextLine();
        
        try(Scanner scannerForFiles = new Scanner(Paths.get(nameOfFile))){
            while(scannerForFiles.hasNextLine()){
                String row = scannerForFiles.nextLine();
                String[] parts = row.split(",");
                System.out.println(parts[0] + ", age: " + Integer.valueOf(parts[1]) + " years");
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
