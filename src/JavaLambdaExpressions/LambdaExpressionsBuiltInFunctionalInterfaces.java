package JavaLambdaExpressions;

import java.util.function.*;

public class LambdaExpressionsBuiltInFunctionalInterfaces {

    public static void main(String[] args) {

        Predicate<String> isOkay = str -> str.equals("Okay");
        if (isOkay.test("Java")){
            System.out.println("This is Okay.");
        } else {
            System.out.println("This is not okay.");
        }

        Function<String, String> breathingReminder = str -> str.toLowerCase();
        String breathe = "INHALE, EXHALE";
        System.out.println(breathingReminder.apply(breathe));

        Consumer<String> userData = name -> System.out.println("User's name is " + name);
        userData.accept("Christina");

        Supplier<Integer> between0And100 = () -> (int) (Math.random()*100);
        System.out.println(between0And100.get());
    }



}
