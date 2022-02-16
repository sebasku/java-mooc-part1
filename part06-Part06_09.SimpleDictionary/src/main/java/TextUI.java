
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
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start(){
        while(true){
            String word = scanner.nextLine();
            
            if(word.equals("end")){
                System.out.println("Bye bye!");
                break;
            }
            
            if(word.equals("add")){
                String wordToPut = scanner.nextLine();
                String translation = scanner.nextLine();
                this.dictionary.add(wordToPut, translation);
            }
            
            if(word.equals("search")){
                String wordToTranslate = scanner.nextLine();
                String searched = this.dictionary.translate(wordToTranslate);
                if(searched == null){
                    System.out.println("Word " + wordToTranslate + " was not found");
                } else {
                    System.out.println(this.dictionary.translate(wordToTranslate));
                }
            }
            
            System.out.println("Unkown command");
        }
    }
}
