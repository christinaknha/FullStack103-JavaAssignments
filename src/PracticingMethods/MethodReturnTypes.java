package PracticingMethods;
import java.util.Scanner;

public class MethodReturnTypes {
    public static void main(String[] args){

//      Calls function to return string
        String stringValue = returnString();
        System.out.println(stringValue);

//      Calls function that returns integer
        int integerValue = returnInteger();
        System.out.println(integerValue);

//      Calls function that returns boolean
        boolean booleanValue = returnBoolean();
        System.out.println(booleanValue);

    }
//    Method that returns string
    public static String returnString(){
//      Asks for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of text: ");

//      Stores user input as appropriate type
        String userString = scanner.nextLine();
        return userString;
    }

//    Method that returns integer
    public static int returnInteger(){
//      Asks for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");

//      Stores user input as appropriate type
        int userInteger = Integer.valueOf(scanner.nextLine());
//        System.out.println(userInteger);
        return userInteger;
    }

//    Method that returns Boolean
    public static boolean returnBoolean(){
//      Asks for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter true or false: ");

//      Stores user input as appropriate type
        boolean userBoolean = Boolean.valueOf(scanner.nextLine());

//      Prints and returns user input
        return userBoolean;
    }
}
