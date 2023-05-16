package LibraryManagementSystem;

public class DVD extends LibraryItem {
    private String title;
    private int releaseYear;
    private String director;
    private int duration;


//  Constructor of DVD
    public DVD(String title, int releaseYear, String director, int duration) {
        super(title, releaseYear);
        this.director = director;
        this.duration = duration;
    }

    //  Create get statements
    public String getDirector(String director) {
        this.director = director;
        return director;
    }

    public int getDuration(int duration) {
        this.duration = duration;
        return duration;
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
    String getItemType() {
        return "This item is a DVD";
    }

    @Override
    String getItemDetails() {
        return getItemType() + "This movie was directed by " + director + ". The movie is " + duration + " minutes long.";
    }
}
