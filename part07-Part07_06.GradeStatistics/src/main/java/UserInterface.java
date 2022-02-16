
import java.util.Arrays;
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
    private GradingSystem gradingSystem;
    
    public UserInterface(Scanner scanner, GradingSystem gradingSystem){
        this.scanner = scanner;
        this.gradingSystem = gradingSystem;
    }
    
    public void start(){
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            int numberFromUser = Integer.valueOf(scanner.nextLine());
            
            if(numberFromUser == -1){
                break;
            }
            
            if(numberFromUser >= 0 && numberFromUser <= 100){
                gradingSystem.addToList(numberFromUser);
            }
        }
        
        System.out.println("Point average (all): " + gradingSystem.averageOfAllPoints());
        
        double average;
        average = gradingSystem.averageOfPassingPoints();
        if(average == 0){
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + average);
        }
        
        System.out.println("Pass percentage: " + gradingSystem.percentageOfPassingPoints());
        
        int[] array = gradingSystem.gradesDistribution();
        System.out.println("Grade distribution:");
        for(int index = array.length-1; index >= 0; index--){
            System.out.print(index + ": ");
            for(int j = 0; j < array[index]; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
