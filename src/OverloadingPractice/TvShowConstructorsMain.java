package OverloadingPractice;
import java.util.ArrayList;
import java.util.Scanner;

public class TvShowConstructorsMain {
    public static void main(String[] args){
//      Create scanner looking for user input
        Scanner scanner = new Scanner(System.in);

//      Create array to store information
        ArrayList<TvShowConstructors> showList = new ArrayList<>();

        showList.add(new TvShowConstructors("Friends", 236, "Sitcom"));
        showList.add(new TvShowConstructors("The Office", 201));
        showList.add(new TvShowConstructors("The Simpsons"));
        showList.add(new TvShowConstructors());

//      Print user instructions
        System.out.println("Fill out the following information. Enter a blank show name when you are done.");

//      Create a while loop that runs while true
        while(true){
//          Ask for and store show name in variable
            System.out.println("Name of show: ");
            String userShowName = scanner.nextLine();

            if (userShowName.equals("")){
                for (int i = 0; i < showList.size(); i++) {
                    System.out.println(showList.get(i));
                }
                break;
            }

//          Ask for number of episodes and store in a variable
            System.out.println("How many episodes?");
            int userNumEpisodes = Integer.valueOf(scanner.nextLine());

//          Ask for genre and store in variable
            System.out.println("What is the genre?");
            String userGenre = scanner.nextLine();

            showList.add( new TvShowConstructors(userShowName, userNumEpisodes, userGenre));

        }

    }
}
