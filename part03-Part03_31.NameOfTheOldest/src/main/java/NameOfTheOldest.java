
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

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
        int oldest = 0;
        String oldestName = null;
        for(String line : strings){
            String[] splitted = line.split(",");
            if(oldest < Integer.valueOf(splitted[1])){
                oldest = Integer.valueOf(splitted[1]);
                oldestName = splitted[0];
            }
        }
        System.out.println("Age of the oldest: " + oldestName);
    }
}

