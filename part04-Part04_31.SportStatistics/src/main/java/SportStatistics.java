
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Team:");
        String teamName = scan.nextLine();
        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;
        
        try(Scanner scanFile = new Scanner(Paths.get(fileName))){
            while(scanFile.hasNextLine()){
                String rowFromFile = scanFile.nextLine();
                String[] partsOfRow = rowFromFile.split(",");
                if(partsOfRow[0].equals(teamName)){
                    gamesPlayed++;
                    if(Integer.valueOf(partsOfRow[2]) > Integer.valueOf(partsOfRow[3])){
                        wins++;
                    } else {
                        losses++;
                    }
                } else if(partsOfRow[1].equals(teamName)){
                    gamesPlayed++;
                    if(Integer.valueOf(partsOfRow[3]) > Integer.valueOf(partsOfRow[2])){
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }    
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        
    }

}
