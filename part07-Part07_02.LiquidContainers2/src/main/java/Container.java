/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebkula
 */
public class Container {

    private int amount;

    public Container() {
        this.amount = 0;
    }

    public int contains() {
        return this.amount;
    }

    public void add(int amount) {
        if (!(this.amount + amount > 100)) {
            if (amount > 0) {
                this.amount = this.amount + amount;
            }
        } else {
            this.amount = 100;
        }
    }

    public void remove(int amount) {
        if (!(this.amount - amount < 0)) {
            if (amount > 0) {
                this.amount = this.amount - amount;
            }
        } else {
            this.amount = 0;
        }
    }

    public String toString(){
        return this.amount + "/100";
    }
}
