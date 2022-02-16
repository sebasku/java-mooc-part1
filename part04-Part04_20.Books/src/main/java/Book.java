/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebkula
 */
public class Book {
    private String title;
    private int pages;
    private int year;
    
    public Book(String titleOfBook, int pagesOfBook, int yearOfBook){
        this.title = titleOfBook;
        this.pages = pagesOfBook;
        this.year = yearOfBook;
    }
    
    @Override
    public String toString(){
        return this.title + ", " + this.pages + " pages, " + this.year;
    }
    
    public String getTitle(){
        return this.title;
    }
}
