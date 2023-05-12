package ObjectsInListPractice;

public class Book {
//  Set Book attributes
    private String title;
    private int amountPages;
    private int yearPublished;

//  Create constructor for just book titles
    public Book(String bookTitle, int bookNumPages, int bookPublished){
        this.title = bookTitle;
        this.amountPages = bookNumPages;
        this.yearPublished = bookPublished;
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
