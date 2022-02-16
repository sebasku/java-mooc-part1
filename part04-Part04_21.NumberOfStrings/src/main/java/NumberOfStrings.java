
import java.util.Scanner;
import java.util.ArrayList;


public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOfStrings = new ArrayList<>();
        
        while(true){
            String lineFromUser = scanner.nextLine();
            if(lineFromUser.equals("end")){
                break;
            }
            listOfStrings.add(lineFromUser);
        }
        System.out.println(listOfStrings.size());
    }
}
