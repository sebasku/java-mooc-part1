
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebkula
 */
public class GradingSystem {
    private ArrayList<Integer> pointsList;
    
    public GradingSystem(){
        this.pointsList = new ArrayList<>();
    }
    
    public void addToList(int points){
        this.pointsList.add(points);
    }
    
    public double averageOfAllPoints(){
        int value = 0;
        for(int number : pointsList){
            value = value + number;
        }
        
        return value*1.0/pointsList.size();
    }
    
    public double averageOfPassingPoints(){
        int value = 0, size = 0;
        for(int number : pointsList){
            if(number >= 50){
                value = value + number;
                size++;
            }
        }
        
        if(size == 0){
            return 0;
        }
        
        return value*1.0/size;
    }
    
    public double percentageOfPassingPoints(){
        int value = 0, numberOfPassed = 0;
        for(int number : pointsList){
            value = value + number;
            if(number >= 50){
                numberOfPassed++;
            }
        }
        
        return 100.0*numberOfPassed/pointsList.size();
    }
    
    /**
     *
     * @return
     */
    public int[] gradesDistribution(){
        int value = 0, array[];
        array = new int[6];
        
        for(int number : pointsList){
            value = value + number;
            if(number <= 50){
                array[0]++;
            } else if(number < 60){
                array[1]++;
            } else if(number < 70){
                array[2]++;
            } else if(number < 80){
                array[3]++;
            } else if(number < 90){
                array[4]++;
            } else if(number < 100){
                array[5]++;
            }
        }
        
        return array;
    }
}
