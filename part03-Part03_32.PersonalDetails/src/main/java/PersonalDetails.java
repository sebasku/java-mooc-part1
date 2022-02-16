
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

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
        int avgOfYears = 0;
        String name = "";
        for(String line : strings){
            String[] splitted = line.split(",");
            avgOfYears = avgOfYears + Integer.valueOf(splitted[1]);
            if(name.length() < splitted[0].length()){
                name = splitted[0];
            }
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + 1.0*avgOfYears/strings.size());
    }
}

