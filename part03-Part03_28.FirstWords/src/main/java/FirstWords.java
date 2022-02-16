
import java.util.Scanner;
import java.util.ArrayList;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> strings = new ArrayList<>();
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            strings.add(input);
        }
        for(String line : strings){
            String[] splitted = line.split(" ");
            System.out.println(splitted[0]);
        }
    }
}
