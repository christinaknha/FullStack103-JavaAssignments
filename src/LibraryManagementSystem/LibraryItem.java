package LibraryManagementSystem;

//Create abstract class with String title and int release year attributes
abstract class LibraryItem {
    private String title;
    private int releaseYear;

//  Constructor for LibraryItem
    public LibraryItem(String title, int releaseYear){
        this.title = title;
        this.releaseYear = releaseYear;

    }
    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    abstract String getItemType();

    abstract String getItemDetails();
}

