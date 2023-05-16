package LibraryManagementSystem;

 public class Book extends LibraryItem{
     private String title;
     private int releaseYear;
     private String author;
     private String ISBN;

     //   Constructor of Book
     public Book(String title, int releaseYear, String author, String ISBN) {
         super(title, releaseYear);
         this.author = author;
         this.ISBN = ISBN;
     }

     //   get statements

     public String getAuthor(String author){
         this.author = author;
         return this.author;
     }

     public String getISBN(String ISBN){
         this.ISBN = ISBN;
         return this.ISBN;
     }

     @Override
     public int getReleaseYear() {
         return releaseYear;
     }

     @Override
     public String getTitle() {
         return title;
     }

     @Override
     String getItemType(){
        return "This item is a book.";
     };

     @Override
     String getItemDetails() {
         return getItemType()+ "It was written by " + author + ". The ISBN number is " + ISBN;
     }
 }
