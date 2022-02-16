
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int endingValue = Integer.valueOf(scanner.nextLine());
        int beginningValue = Integer.valueOf(scanner.nextLine());
        for(;beginningValue<=endingValue;beginningValue++){
            System.out.println(beginningValue);
        }
    }
}
