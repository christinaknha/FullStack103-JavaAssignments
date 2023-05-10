package ArrayAndListPractice;
import java.util.Scanner;
import java.util.ArrayList;
public class HowLarge {
    public static void main(String[] args){
//      Create scanner for user input
        Scanner scanner = new Scanner(System.in);

//      Create array to store user input
        ArrayList<String> userInputList = new ArrayList<String>();

//      Print instructions
        System.out.println("Type in a few words, pressing enter after each word. When you are done, enter a blank input. The program will return how many items was in the list.");

        while(true){
//          Takes user input and stores it into the array
            String userInput = scanner.nextLine();
            userInputList.add(userInput);

//          When user enters a blank, prints out size of the array minus the blank space and then breaks code.
            if (userInput.equals("")){
                int size = userInputList.size();
                System.out.println("The total amount of items in the list was: " + (size - 1));
                break;
            }
        }
    }
}
