import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            String nameOfProgram = scanner.nextLine();
            if(nameOfProgram.isEmpty()){
                break;
            }
            int durationOfProgram = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(nameOfProgram, durationOfProgram));
        }
        
        System.out.print("Program's maximum duration?");
        int maxDurationOfProgram = Integer.valueOf(scanner.nextLine());
        
        for(TelevisionProgram oneProgram : programs){
            if(oneProgram.getDuration() <= maxDurationOfProgram){
                System.out.println(oneProgram.getName() + ", " + oneProgram.getDuration() + " minutes");
            }
        }
    }
}
