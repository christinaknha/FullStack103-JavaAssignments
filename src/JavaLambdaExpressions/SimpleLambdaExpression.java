package JavaLambdaExpressions;

import java.util.function.BinaryOperator;

public class SimpleLambdaExpression {
    public static void main(String[] args){
        BinaryOperator<Integer> sum = (a, b) -> a + b;

        System.out.println(sum.apply(2,8));

        BinaryOperator<Integer> difference = (a, b) -> a - b;
        System.out.println(difference.apply(2,8));

        BinaryOperator<Integer> product = (a, b) -> a * b;
        System.out.println(product.apply(2,8));

        BinaryOperator<Double> quotient = (a, b) -> a / b;
        System.out.println(quotient.apply(2.0,8.0));

    }

}

