package ObjectsInListPractice;

public class TvShow {
    private String name;
    private int episodes;
    private String genre;

    public TvShow(String showName, int numEpisodes, String showGenre){
        this.name = showName;
        this.episodes = numEpisodes;
        this.genre = showGenre;

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
