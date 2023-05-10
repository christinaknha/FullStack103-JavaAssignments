package PracticingMethods;
import java.util.Scanner;

public class AverageMethod {
    public static void main(String[] args){
//      Creates scanner for user input
        Scanner scanner = new Scanner(System.in);

//      Asks user for number and stores inside a variable
        System.out.println("Please enter a number: ");
        int firstNum = Integer.valueOf(scanner.nextLine());

//      Asks user for number and stores inside a variable
        System.out.println("Please enter another number: ");
        int secondNum = Integer.valueOf(scanner.nextLine());

//      Asks user for number and stores inside a variable
        System.out.println("Please enter another number: ");
        int thirdNum = Integer.valueOf(scanner.nextLine());

//      Calls average function
        average(firstNum, secondNum, thirdNum);
    }

//  Creates a function that finds the sum of three numbers
    public static int sum(int num1, int num2, int num3){
        int total = num1 + num2 + num3;
        return total;
    }
//  Creates function that calls on the sum function to find average of three numbers
    public static double average(int num1, int num2, int num3){
        double average = Double.valueOf(sum(num1, num2, num3)/ 3.0);
        System.out.println("The average is: " + average);
        return average;
    }
}
