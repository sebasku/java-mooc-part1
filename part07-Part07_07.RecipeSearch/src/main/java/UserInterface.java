
import java.io.IOException;
import java.nio.file.Paths;
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
    Scanner scanner;
    RecipesSystem recipes;
    
    public UserInterface(Scanner scanner, RecipesSystem recipes){
        this.scanner = scanner;
        this.recipes = recipes;
    }
    
    public void start(){
        System.out.print("File to read: ");
        System.out.flush();
        String fileName = scanner.nextLine();
        readRecipes(fileName);
        System.out.println();
        while(true){
            System.out.println("Commands:\nlist - lists the recipes\nstop - stops the program\n"
                    + "find name - searches recipes by name\nfind cooking time - searches recipes by cooking time\n"
                    + "find ingredient - searches recipes by ingredient");
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            System.out.println();
            if(command.equals("list")){
                System.out.println("\nRecipes:");
                System.out.println(this.recipes.getNamesAndTimes());
            }
            if(command.equals("find name")){
                System.out.print("Searched word: ");
                System.out.flush();
                String name = scanner.nextLine();
                
                System.out.println("\nRecipes:");
                System.out.println(this.recipes.getRecipesByName(name) + "\n");
            }
            if(command.equals("find cooking time")){
                System.out.print("Max cooking time: ");
                Integer cookingTime = Integer.valueOf(scanner.nextLine());
                
                System.out.println("\nRecipes: ");
                System.out.println(this.recipes.getRecipesByTime(cookingTime) + "\n");
            }
            if(command.equals("find ingredient")){
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                
                System.out.println("\nRecipes: ");
                System.out.println(this.recipes.getRecipesByIngredient(ingredient) + "\n");
            }
            if(command.equals("stop")){
                break;
            }
        }
    }
        
    public void readRecipes(String fileName){
        try ( Scanner openFile = new Scanner(Paths.get(fileName))) {
            String name = openFile.nextLine();
            int cookingTime = Integer.valueOf(openFile.nextLine());
            Recipe recipe = new Recipe(name, cookingTime);
            this.recipes.addRecipe(recipe);
            while (openFile.hasNextLine()) {
                String row = openFile.nextLine();
                if (row == null || row.trim().length() == 0) {
                    name = openFile.nextLine();
                    cookingTime = Integer.valueOf(openFile.nextLine());
                    recipe = new Recipe(name, cookingTime);
                    this.recipes.addRecipe(recipe);
                } else {
                    recipe.addIngredient(row);
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
