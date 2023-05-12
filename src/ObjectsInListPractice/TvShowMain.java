package ObjectsInListPractice;
import java.util.Scanner;
import java.util.ArrayList;

public class TvShowMain {
    public static void main(String[] args){
//      Create scanner looking for user input
        Scanner scanner = new Scanner(System.in);

//      Create array to store information
        ArrayList<TvShow> showList = new ArrayList<>();

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

            showList.add( new TvShow(userShowName, userNumEpisodes, userGenre));

        }

    }
}
