package OverloadingPractice;

public class BookConstructors {
    //  Set Book attributes
    private String title;
    private int amountPages;
    private int yearPublished;

    //  Create constructor for just book titles
    public BookConstructors(String bookTitle, int bookNumPages, int bookPublished){
        this.title = bookTitle;
        this.amountPages = bookNumPages;
        this.yearPublished = bookPublished;
    }

    public BookConstructors(String bookTitle, int bookNumPages){
        this.title = bookTitle;
        this.amountPages = bookNumPages;
    }

    public BookConstructors(String bookTitle){
        this.title = bookTitle;
    }

    public BookConstructors(){

    }

//  Getters to pull all the information

    public String getTitle(){
        return title;
    }

    public int getAmountPages(){
        return amountPages;
    }

    public int getYearPublished(){
        return yearPublished;
    }
}
