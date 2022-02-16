
import java.util.Scanner;
import java.util.ArrayList;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            lines.add(input);
        }
        
        for(String line : lines){
            String[] splitted = line.split(" ");
            for(String word : splitted){
                if(word.contains("av")){
                    System.out.println(word);
                }
            }
        }
        
    }
}
