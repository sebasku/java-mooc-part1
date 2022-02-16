
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            String firstName = scanner.nextLine();
            if(firstName.isEmpty()){
                break;
            }
            String lastName = scanner.nextLine();
            String idOfUser = scanner.nextLine();
            infoCollection.add(new PersonalInformation(firstName,lastName,idOfUser));
        }
        for(PersonalInformation oneItem : infoCollection){
            System.out.println(oneItem.getFirstName() + " " + oneItem.getLastName());
        }
    }
}
