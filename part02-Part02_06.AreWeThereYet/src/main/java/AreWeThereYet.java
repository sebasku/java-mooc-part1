
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Give a number:");
            int valueFromUser = Integer.valueOf(scanner.nextLine());
            if(valueFromUser == 4){
                break;
            }
        }
    }
}
