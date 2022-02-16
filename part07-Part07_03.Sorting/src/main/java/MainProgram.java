
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int[] array){
        int smallest = array[0];
        for(int number : array){
            if(smallest > number){
                smallest = number;
            }
        }
        return smallest;
    }    
    
    public static int indexOfSmallest(int[] array){
        int smallest = array[0], saveIndex = 0;
        for(int index = 0;index < array.length;index++){
            if(smallest > array[index]){
                smallest = array[index];
                saveIndex = index;
            }
        }
        return saveIndex;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int smallest = table[startIndex], saveIndex = startIndex;
        for(int index = startIndex;index < table.length;index++){
            if(smallest > table[index]){
                smallest = table[index];
                saveIndex = index;
            }
        }
        return saveIndex;    
    }
    
    public static void swap(int[] array, int index1, int index2){
        int storeValue;
        storeValue = array[index1];
        array[index1] = array[index2];
        array[index2] = storeValue;
    }
    
    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            int smallest = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, smallest, i);
        }
    }
}
