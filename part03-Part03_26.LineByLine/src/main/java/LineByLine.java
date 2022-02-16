
import java.util.Scanner;
import java.util.ArrayList;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> inputs = new ArrayList<>();
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            inputs.add(input);
        }
        
        for(int i = 0; i < inputs.size(); i++){
            String line = inputs.get(i);
            String[] splitted = line.split(" ");
            for(String oneLine : splitted){
                System.out.println(oneLine);
            }
        }
        

    }
}
