
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
public class Room {
    ArrayList<Person> persons;
    
    public Room(){
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person){
        this.persons.add(person);
    }
    
    public boolean isEmpty(){
        if(this.persons.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
    
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    
    public Person shortest(){
        if(this.isEmpty()){
           return null; 
        }
        
        if(this.persons.size() < 2){
            return persons.get(0);
        }
        
        Person tempPerson = persons.get(0);
        for(int index=1; index < persons.size(); index++){
            if(tempPerson.getHeight() > persons.get(index).getHeight()){
                tempPerson = persons.get(index);
            }
        }
        
        return tempPerson;
    }
    
    public Person take(){
        if(this.isEmpty()){
           return null; 
        }
        
        Person tempPerson = persons.get(0);
        int saveIndex = 0;
        
        if(this.persons.size() < 2){
            tempPerson = persons.get(0);
            persons.remove(saveIndex);
            return tempPerson;
        }
        
        for(int index=1; index < persons.size(); index++){
            if(tempPerson.getHeight() > persons.get(index).getHeight()){
                tempPerson = persons.get(index);
                saveIndex = index;
            }
        }
        persons.remove(saveIndex);
        
        return tempPerson;
    }
}
