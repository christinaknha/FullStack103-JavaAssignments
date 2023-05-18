package PracticeHandlingExceptions;

import java.util.Scanner;
//import set
import java.util.HashSet;
import java.util.Set;
public class ValidatingParametersCalculator {
    private int n;
    private int k;
    private int factorialNum;

    public ValidatingParametersCalculator() {
        int factorialNum;
        HashSet<Integer> bigSet;
        HashSet<Integer> subSet;

    }

    public int getN() {
        return n;
    }

    public int getK() {
        return k;
    }

    public int getFactorialNum() {
        return factorialNum;
    }

    public int factorial(int factorialNum){
            int factorial = 1;
            for(int i = 1; i <= factorialNum; i++){
                factorial = factorial * i;
                System.out.println(factorial);
            }
            return factorial;
    }

    public void binomialCoefficient(int n, int k){
        int calculatedBinomialCoefficient = factorial(n) / factorial(k) * factorial(n - k);
        System.out.println(calculatedBinomialCoefficient);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number.");
        int factorialNum = Integer.valueOf(scanner.nextInt());

        if (factorialNum < 0) {
            throw new IllegalArgumentException("Please enter a non-negative number.");
        }

        ValidatingParametersCalculator runCalculation = new ValidatingParametersCalculator();
        runCalculation.factorial(factorialNum);


        Set<Integer> bigSet = new HashSet<>();
        Set<Integer> subSet = new HashSet<>();

        System.out.println("Please enter a number for your set size: ");
        int n = Integer.valueOf(scanner.nextInt());

        System.out.println("Please enter another number for your subset size: ");
        int k = Integer.valueOf(scanner.nextInt());

        if (n < 0 || k < 0 || k > n){
            throw new IllegalArgumentException("Please enter positive numbers or check to see that k < n.");
        }

        runCalculation.binomialCoefficient(n,k);



    }
}

