
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebkula
 */
public class UserInterface {
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.scanner = scanner;
        this.list = list;
    }
    
    public void start(){
        while(true){
            String word = scanner.nextLine();
            
            if(word.equals("stop")){
                break;
            }
            
            if(word.equals("add")){
                String wordAdd = scanner.nextLine();
                this.list.add(wordAdd);
            }
            
            if(word.equals("list")){
                this.list.print();
            }
            
            if(word.equals("remove")){
                int number = Integer.valueOf(scanner.nextLine());
                this.list.remove(number);
            }
        }
    }
}
