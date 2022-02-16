
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int container1 = 0, container2 = 0;
        while (true) {
            String input = scan.nextLine();
            

            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            if(parts[0].equals("add")){
                if(!(container1 + Integer.valueOf(parts[1]) > 100)){
                    if(Integer.valueOf(parts[1]) > 0){
                        container1 = container1 + Integer.valueOf(parts[1]);
                    }
                } else {
                    container1 = 100;
                }
            } else if(parts[0].equals("move")){
                if(!(container2 + Integer.valueOf(parts[1]) > 100)){
                    if(container1 >= Integer.valueOf(parts[1])){
                        container2 = container2 + Integer.valueOf(parts[1]); 
                    } else {
                        container2 = container2 + container1;
                    }
                } else {
                    container2 = 100;
                }
                if(!(container1 < Integer.valueOf(parts[1]))){
                    container1 = container1 - Integer.valueOf(parts[1]);
                } else {
                    container1 = 0;
                }
            } else if(parts[0].equals("remove")){
                if(!(container2 - Integer.valueOf(parts[1]) < 0)){
                    container2 = container2 - Integer.valueOf(parts[1]);
                } else {
                    container2 = 0;
                }
            }


        }
    }
    
}
