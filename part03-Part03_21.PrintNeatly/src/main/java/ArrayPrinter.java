
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {92, 94, 54, 116, 46, 82, 62, 93, 6, 52, 109, 121, 32, 70, 85, 93, 10, 84, 85, 0, 15, 143, 20, 89, 63, 71, 103, 110, 116, 36, 95, 130, 107, 28, 108, 78, 16, 9, 76, 115, 31, 30, 135, 38, 138, 48, 133, 54, 28, 0, 48, 88, 144, 115, 4, 105, 91, 44, 66, 117, 30, 54, 10, 141, 126, 81, 98, 110, 97, 81, 8, 126, 56, 59, 49, 127, 93, 115, 104, 68, 16, 77, 82, 99, 12, 89, 16, 136, 0, 12, 50, 39, 43, 7, 21, 5, 139, 58, 96, 133};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        for(int number : array){
            if(array[array.length-1] == number){
                System.out.print(number);
            } else{
                System.out.print(number + ", ");
            }
            
        }
    }
}
