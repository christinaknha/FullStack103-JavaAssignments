package PracticeHandlingExceptions;
import java.util.Scanner;

public class ValidatingParametersPerson {
    private String name;
    private int age;

    public ValidatingParametersPerson(String name, int age) {
        if( name == null || name.trim().isEmpty() || name.length() >40 ){
            throw new IllegalArgumentException("You must enter a name and it must be less than 40 characters long.");
        }
        this.name = name;

        if( age < 0 || age > 120){
            throw new IllegalArgumentException("Age must be between 0 and 100");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = scanner.nextLine();

        System.out.println("How old are you?");
        int userAge = Integer.valueOf(scanner.nextLine());

        ValidatingParametersPerson person = new ValidatingParametersPerson(userName, userAge);
        System.out.println(person.name);
        System.out.println(person.age);

//        ValidatingParametersPerson person = new ValidatingParametersPerson("christina", 28);
//        System.out.println(person.name);
//        System.out.println(person.age);

//        ValidatingParametersPerson person2 = new ValidatingParametersPerson("", 28);
//        System.out.println(person2.name);
//        System.out.println(person2.age);

//        ValidatingParametersPerson person3 = new ValidatingParametersPerson("Erika", 250);
//        System.out.println(person3.name);
//        System.out.println(person3.age);


    }
}
