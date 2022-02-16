
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        
        while(true){
            System.out.println("Identifier?(empty will stop");
            String firstInput = scanner.nextLine();
            if(firstInput.equals("")){
                break;
            }
            System.out.println("Name?(empty will stop");
            String secondInput = scanner.nextLine();
            if(secondInput.equals("")){
                break;
            }
            Item item = new Item(firstInput, secondInput);
            if(!items.contains(item)){
                items.add(item);
            }
        }
        
        for(Item oneItem : items){
            System.out.println(oneItem);
        }
    }
}
