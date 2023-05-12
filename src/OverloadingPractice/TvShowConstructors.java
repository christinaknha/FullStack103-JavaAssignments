package OverloadingPractice;

public class TvShowConstructors {
    private String name;
    private int episodes;
    private String genre;

//  Constructor using all attributes
    public TvShowConstructors(String showName, int numEpisodes, String showGenre){
        this.name = showName;
        this.episodes = numEpisodes;
        this.genre = showGenre;

    }

//  Constructors using 2 attributes
    public TvShowConstructors(String showName, int numEpisodes){
        this.name = showName;
        this.episodes = numEpisodes;
    }
    public TvShowConstructors(String showName, String showGenre){
        this.name = showName;
        this.genre = showGenre;
    }

//  Constructors using one attribute

    public TvShowConstructors(String showName){
        this.name = showName;
    }

//  Constructors using no attribute
    public TvShowConstructors() {

    }
    public String getName(){
        return name;
    }

    public int getEpisodes(){
        return episodes;
    }

    public String getGenre(){
        return genre;
    }

    @Override
    public String toString(){
        String myString = "The name of the show is " + getName() + " with " + getEpisodes() + " number of episodes." +
                " The genre is " + getGenre() + ".";
        return myString;
    }
}
