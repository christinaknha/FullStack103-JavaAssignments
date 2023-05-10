package ArrayAndListPractice;
import java.util.Scanner;
import java.util.ArrayList;

public class IndexOfInteger {
    public static void main(String[] args){
//      Create scanner for user input
        Scanner scanner = new Scanner(System.in);

//      Create array to store user input
        ArrayList<Integer> userInputList = new ArrayList<Integer>();

//      Display instructions
        System.out.println("Type in a numbers, pressing enter after each word. When you are done, enter 0 and ask for the program to search for a specific number.");


        while(true){
//          Pull and store user input into array
            int userInput = Integer.valueOf(scanner.nextLine());
            userInputList.add(userInput);

//          Checks to see if user input is equal to 0
            if (userInput == 0) {
                System.out.println("You are done entering integers into the list.");

//              Ask user for number to look for and stores it in the appropriate variable and type
                System.out.println("What number are you looking for in the list?");
                int searchForInteger = Integer.valueOf(scanner.nextLine());

//              Looks for index of array where value is equal to user input to search for
                for (int i = 0; i < userInputList.size(); i++) {
                    if (searchForInteger == userInputList.get(i)) {
                        System.out.println(searchForInteger + " is at index " + i);
                    }
                }
                break;
            }

            }
        }

    }

