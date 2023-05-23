package TakingLibraryManagementFurther;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private int pages;
    private String category;
    private boolean isOnLoan;
    private int daysOnLoan;

    public Book(String title, String author, int publicationYear, int pages, String category, boolean isOnLoan) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.pages = pages;
        this.category = category;
        this.isOnLoan = isOnLoan;
        this.daysOnLoan = 0;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getPages() {
        return pages;
    }

    public String getCategory() {
        return category;
    }

    public boolean isOnLoan() {
        return isOnLoan;
    }

    public int getDaysOnLoan() {
        return daysOnLoan;
    }

    public void setOnLoan(boolean onLoan) {
        isOnLoan = onLoan;
    }

    public void setDaysOnLoan(int daysOnLoan) {
        this. daysOnLoan = daysOnLoan;
    }

    @Override
    public String toString(){
        return ("Title: " + title + " Author: " + author + " Publication Year: " + publicationYear + " Book Length: " + pages +
                " Category: " + category + " On Loan: " + isOnLoan);
    }
}
