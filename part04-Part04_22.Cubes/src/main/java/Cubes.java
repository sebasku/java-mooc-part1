
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String newLine = scanner.nextLine();
            if(newLine.equals("end")){
                break;
            }
            int cube = Integer.valueOf(newLine);
            cube = cube * cube * cube;
            System.out.println(cube);
        }
    }
}
