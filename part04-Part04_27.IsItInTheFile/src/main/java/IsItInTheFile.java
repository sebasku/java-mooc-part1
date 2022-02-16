
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        
        System.out.println("Search for:");
        String searchingFor = scanner.nextLine();
        
        Boolean isFound = false;
        try(Scanner scannerFiles = new Scanner(Paths.get(fileName))){
            while(scannerFiles.hasNextLine()){
                String lineFromFile = scannerFiles.nextLine();
                if(lineFromFile.contains(searchingFor)){
                    isFound = true;
                    break;
                } else {
                    isFound = false;
                }
            }
        } catch(Exception e){
            System.out.println("Reading the file " + e.getMessage() + " failed.");
        }
        
        if(isFound == true){
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
    }
}
