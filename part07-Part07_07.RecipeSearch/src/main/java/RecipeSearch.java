
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipesSystem recipes = new RecipesSystem();
        UserInterface userInterface = new UserInterface(scanner, recipes);
        userInterface.start();
    }

}
