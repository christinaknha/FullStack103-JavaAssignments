package ArrayAndListPractice;
import java.util.Scanner;
import java.util.ArrayList;

public class LastItem {
    public static void main(String[] args){
//      Create scanner for user input
        Scanner scanner = new Scanner(System.in);

//      Create array to store user input
        ArrayList<String> userInputList = new ArrayList<String>();

//      Display instructions
        System.out.println("Type in a few words, pressing enter after each word. When you are done, enter a blank input. The program will return the last word in the list.");

//      Create function that runs until user enters a blank
        while(true){
//          Stores user input into array
            String userInput = scanner.nextLine();
            userInputList.add(userInput);

            if(userInput.equals("")){
                int listLength = userInputList.size();
                String lastWord = userInputList.get(listLength - 2);
                System.out.println("The last item in the list is: " + lastWord);
                break;
            }
        }
    }
}
