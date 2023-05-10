package PracticingMethods;
import java.util.Scanner;
public class DivideMethod {
    public static void main(String[] args) {
//      Set up scanner for user input
        Scanner scanner = new Scanner(System.in);

//      Ask user for number input and stores inside variable
        System.out.println("Please enter a number: ");
        int num1 = Integer.valueOf(scanner.nextLine());

//      Ask user for another number input and stores inside another variable
        System.out.println("Please enter a number: ");
        int num2 = Integer.valueOf(scanner.nextLine());

        divide(num1, num2);
    }
    public static void divide(int numOne, int numTwo){
        System.out.println(numOne + " / " + numTwo + " = " + (Double.valueOf(numOne)/Double.valueOf(numTwo)));
    }
}
