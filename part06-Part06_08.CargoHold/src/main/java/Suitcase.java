
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
public class Suitcase {
    private int maximumWeight;
    private ArrayList<Item> items;
    
    public Suitcase(int maximumWeight){
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item){
        if(this.totalWeight() + item.getWeight() <= this.maximumWeight){
            this.items.add(item);
        }
    }
    
    public int totalWeight(){
        int weightOfItems = 0;
        
        for(Item item : this.items){
            weightOfItems = weightOfItems + item.getWeight();
        }
        
        return weightOfItems;
    }
    
    public void printItems(){
        for(Item item : this.items){
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }
    
    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }
        
        if(this.items.size() == 1){
            return this.items.get(0);
        }
        
        Item heaviestItem = items.get(0);
        for(Item item : this.items){
            if(heaviestItem.getWeight() < item.getWeight()){
                heaviestItem = item;
            }
        }
        
        return heaviestItem;
    }
    
    public String toString(){
        if(this.items.isEmpty()){
            return "no items(0 kg";
        }
        
        if(this.items.size() == 1){
            return "1 item ("+this.totalWeight()+" kg)";
        }
        
        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }
}
