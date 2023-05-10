package ArrayAndListPractice;
import java.util.Scanner;
import java.util.ArrayList;

public class FifthItem {
    public static void main(String[] args){
//      Creates scanner for user input
        Scanner scanner = new Scanner(System.in);

//      Creates array for user input to be added to
        ArrayList<String> userInputList = new ArrayList<String>();

//      Prints instructions
        System.out.println("Please enter words separated by hitting the enter key. Enter a blank input when done.");

        while(true){
//          Adds user input to the array
            String userInput = scanner.nextLine();
            userInputList.add(userInput);

//          Breaks code when user enters a blank
            if (userInput.equals("")){
//          Prints out the 5th item in the array
                System.out.println("The fifth item in the list is: " + userInputList.get(4));
                break;
            }



        }
    }
}
