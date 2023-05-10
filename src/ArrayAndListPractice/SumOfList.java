package ArrayAndListPractice;
import java.util.Scanner;
import java.util.ArrayList;
public class SumOfList {
    public static void main(String[] args) {
//      Create scanner for user input
        Scanner scanner = new Scanner(System.in);

//      Create array to store user input
        ArrayList<Integer> userInputList = new ArrayList<Integer>();

        while (true) {
//          Read and store user input into the array
            int userInput = Integer.valueOf(scanner.nextLine());
            userInputList.add(userInput);

//          When user enters 0, call the method that sums and prints results to console.
            if (userInput == 0) {
                userInputList.remove(userInputList.size()-1);
                int total = sumOfArray(userInputList);
                System.out.println(userInputList + " were the items in the list. The sum of that list is: " + total);
                break;
            }
        }
    }

    public static int sumOfArray(ArrayList<Integer> array) {
        int total = 0;
        for (int i = 0; i < array.size(); i++) {
            total = total + array.get(i);
        }
        return total;
    }
}


