

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }

    public static void printFromNumberToOne(int number){
        for(int i = 1; number >= i; number--){
            System.out.println(number);
        }
    }
}
