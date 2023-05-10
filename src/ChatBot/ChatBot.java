package ChatBot;
import java.util.Scanner;
public class ChatBot {
    public static void main(String[] args){
        greetUser();
        nameRepeat();
        ageGuess();
        counting();
        testQuestion();
    }

    public static void greetUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String username = scanner.nextLine();
        System.out.println("Hello " + username);
    }

    public static void nameRepeat(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Can you repeat your name?");
        String nameAgain = scanner.nextLine();
        System.out.println("Cool. So your name is " + nameAgain);
    }

    public static void ageGuess(){
        int userAge = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("I would like to guess your age. Please answer the following questions.");
        for (int i = 20; i < 65; i=i+10) {
            System.out.println("Are you older than " + i + " years old?");
            String guess1 = scanner.nextLine().toLowerCase();
            if (guess1.equals("no")) {
                System.out.println("So you are younger than " + i + " years old.");
                System.out.println("Are you younger than " + (i - 5) + " years old?");
                String guess2 = scanner.nextLine().toLowerCase();
                if (guess2.equals("no")) {
                    for (int j = (i - 5); j < i; j++) {
                        System.out.println("Are you " + j + " years old?");
                        String guess3 = scanner.nextLine().toLowerCase();
                        if (guess3.equals("yes")) {
                            System.out.println("So you are " + j + " years old! How nice!");
                            userAge = j;
                            break;
                        }
                    }
                } else {
                    for (int k = (i - 10); k <= (i - 5); k++) {
                        System.out.println("Are you " + k + " years old?");
                        String guess3 = scanner.nextLine().toLowerCase();
                        if (guess3.equals("yes")) {
                            System.out.println("So you are " + k + " years old! How nice!");
                            userAge = k;
                            break;
                        }
                    }break;

                }break;
            }

        }

    }

    public static void counting(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number would you like me to count to?");
        int userRequest = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i <= userRequest; i++){
            System.out.println(i);
        }
    }

    public static void testQuestion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's see how much programming knowledge you have.");
        System.out.println("Which data type returns decimals?");
        System.out.println("A: int");
        System.out.println("B: double");
        System.out.println("C: char");
        System.out.println("D: boolean");

        boolean initialCond = false;

        while (!initialCond) {
            String answer = scanner.nextLine().toLowerCase();
            switch (answer) {
                case "a":
                    System.out.println("You chose A. Please try again.");
                    break;
                case "b":
                    System.out.println("You chose B. Congratulations!");
                    initialCond = true;
                    break;
                case "c":
                    System.out.println("You chose C. Please try again.");
                    break;
                case "d":
                    System.out.println("You chose D. Please try again.");
                    break;
            }

        }
    }
}


