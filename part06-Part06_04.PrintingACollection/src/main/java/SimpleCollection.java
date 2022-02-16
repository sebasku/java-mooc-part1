
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        String tempString;
        if(this.elements.isEmpty()){
            tempString = "The collection " + this.name + " is empty.";
        } else {
            if(this.elements.size() == 1){
                tempString = "The collection " + this.name + " has " + this.elements.size() + " element:\n";
            } else {
                tempString = "The collection " + this.name + " has " + this.elements.size() + " elements:\n";
            }
            for(String element : elements){
                if(!this.elements.get(this.elements.size()-1).contains(element)){
                    tempString = tempString + element + "\n";
                } else {
                    tempString = tempString + element;
                }
                
            }
        }
        
        return tempString;
    }
    
}
