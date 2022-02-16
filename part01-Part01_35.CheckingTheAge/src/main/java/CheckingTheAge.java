
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userAge = Integer.valueOf(scan.nextLine());
        if(userAge >= 0 && userAge <= 120){
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
