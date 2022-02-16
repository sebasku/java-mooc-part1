
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
public class RecipesSystem {
    private ArrayList<Recipe> recipes;
    
    public RecipesSystem(){
        this.recipes = new ArrayList<>();
    }
    
    public void addRecipe(Recipe recipe){
        this.recipes.add(recipe);
    }
    
    public String getNamesAndTimes(){
        String returnValue = "";
        for(Recipe recipe : recipes){
            returnValue = returnValue + recipe.getNameAndTime() + "\n";
        }
        return returnValue;
    }

    public String getRecipesByName(String name){
        String returnValue = "";
        for(Recipe recipe : recipes){
            if(recipe.getName().contains(name)){
                returnValue = returnValue + recipe.getNameAndTime() + "\n";
            }
        }
        return returnValue;
    }
    
    public String getRecipesByTime(int cookingTime){
        String returnValue = "";
        for(Recipe recipe : recipes){
            if(recipe.getCookingTime() <= cookingTime){
                returnValue = returnValue + recipe.getNameAndTime() + "\n";
            }
        }
        return returnValue;
    }
    
    public String getRecipesByIngredient(String searchedIngredient){
        String returnValue = "";
        for(Recipe recipe : recipes){
            for(String ingredient : recipe.getIngredients()){
                if(ingredient.equals(searchedIngredient)){
                    returnValue = returnValue + recipe.getNameAndTime() + "\n";
                }
            }
        }
        return returnValue;
    }
    
    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    @Override
    public String toString() {
        return "RecipesSystem{" + "recipes=" + recipes + '}';
    }
    
    
}
