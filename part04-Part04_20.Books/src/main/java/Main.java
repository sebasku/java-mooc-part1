import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true){
            String title = scanner.nextLine();
            if(title.isEmpty()){
                break;
            }
            int pages = Integer.valueOf(scanner.nextLine());
            int year = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title,pages,year));
        }
        
        System.out.print("What information will be printed?");
        String typeOfInformation = scanner.nextLine();
        if(typeOfInformation.equals("everything")){
            for(Book oneBook : books){
                System.out.println(oneBook);
            }
        } else if(typeOfInformation.equals("name")){
            for(Book oneBook : books){
                System.out.println(oneBook.getTitle());
            }
        }
    }
}
