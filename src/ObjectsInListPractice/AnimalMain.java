package ObjectsInListPractice;
import java.util.Scanner;
import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args){
//      Create scanner that looks for user input
        Scanner scanner = new Scanner(System.in);

//      Declare arraylist
        ArrayList<Animal> animalList = new ArrayList<>();
//      Print instructions
        System.out.println("Enter your animal's names and whether or not they are a dog. Enter an empty name when you are done.");

//      Creates a loop that runs until a blank name is entered.
        while (true) {

//      Save user input of animal name into variable
            System.out.println("Please enter a name: ");
            String userAnimalName = scanner.nextLine();

//          Checks to see if user input is blank and breaks if it is
            if (userAnimalName.equals("")){
//              Prints the information to the console.
                for (int i = 0; i < animalList.size(); i++){
//                    System.out.println(animalList.get(i).getName() + " is a dog = " + animalList.get(i).getType());
                    System.out.println(animalList.get(i));
                }
                break;
            }

//      Save user input of animal type
            System.out.println("Is it a dog? Yes or no: ");
            String userAnimalType = scanner.nextLine().toLowerCase();
            boolean isAnimalDog = userAnimalType.equals("yes");


//      Create animal object based on user input
            animalList.add(new Animal(userAnimalName, isAnimalDog));
        }
    }
}
