
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
public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maximumWeight){
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public int totalWeight(){
        int weightOfSuitcases = 0;
        
        for(Suitcase suitcase : suitcases){
            weightOfSuitcases = weightOfSuitcases + suitcase.totalWeight();
        }
        
        return weightOfSuitcases;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(this.totalWeight() + suitcase.totalWeight() <= this.maximumWeight){
            this.suitcases.add(suitcase);
        }
    }
    
    public void printItems(){
        for(Suitcase suitcase : suitcases){
            suitcase.printItems();
        }
    }
    
    public String toString(){
        if(this.suitcases.isEmpty()){
            return "no suitcases(0 kg";
        }
        
        if(this.suitcases.size() == 1){
            return "1 suitcase ("+this.totalWeight()+" kg)";
        }
        
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }    
}
