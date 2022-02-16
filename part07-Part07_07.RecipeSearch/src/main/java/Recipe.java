
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
public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe (String name, int cookingTime){
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getCookingTime(){
        return this.cookingTime;
    }
    
    public ArrayList<String> getIngredients(){
        return this.ingredients;
    }
    
    public void addIngredient(String ingredient){
        this.ingredients.add(ingredient);
    }

    public String getNameAndTime(){
        return this.name + ", cooking time: " + this.cookingTime;
    }
    
    @Override
    public String toString() {
        return "Recipe{" + "name=" + name + ", cookingTime=" + cookingTime + ", ingredients=" + ingredients + '}';
    }
}
