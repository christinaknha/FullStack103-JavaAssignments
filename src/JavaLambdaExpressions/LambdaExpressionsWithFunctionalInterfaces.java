package JavaLambdaExpressions;

public class LambdaExpressionsWithFunctionalInterfaces {
//  Defining function interfaces.
@FunctionalInterface
    public interface sum{
    int add(int a, int b);
}

@FunctionalInterface
    public interface difference{
    int subtract(int a, int b);
}

@FunctionalInterface
    public interface product{
    int multiply(int a, int b);
}

@FunctionalInterface
    public interface quotient{
    double divide(double a, double b);
}

public static void main(String[] args){
//  Link lambda expressions to interfaces
    sum s =(a, b) -> a + b;

    difference d = (a, b) -> a - b;

    product p = (a, b) -> a * b;

    quotient q = (a, b) -> a / b;

//  Check to see if code works : call the lambda expression and then the interface method.
    System.out.println(s.add(2,8));
    System.out.println(d.subtract(2,8));
    System.out.println(p.multiply(2,8));
    System.out.println(q.divide(2,8));
    }
}
