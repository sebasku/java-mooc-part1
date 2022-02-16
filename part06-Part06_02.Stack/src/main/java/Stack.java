
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
public class Stack {
    ArrayList<String> stack;
    
    public Stack(){
        this.stack = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if(this.stack.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
    
    public void add(String value){
        this.stack.add(0,value);
    }
    
    public ArrayList<String> values(){
        return this.stack;
    }
    
    public String take(){
        String temp = this.stack.get(0);
        this.stack.remove(0);
        return temp;
    }
}
