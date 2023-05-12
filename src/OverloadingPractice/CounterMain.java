package OverloadingPractice;

public class CounterMain {
    public static void main(String[] args){
//      Constructor that starts at 0
        Counter counter1 = new Counter();
        System.out.println("Counter1 value = " + counter1.value());

//      Decrease Counter by 1. Result should be -1
        counter1.decrease();
        System.out.println("Counter1 value = " + counter1.value());

//      Decrease Counter by 5. Result should be -6
        counter1.decrease(5);
        System.out.println("Counter1 value = " + counter1.value());

//      Increase counter by 1. Result should be -5
        counter1.increase();
        System.out.println("Counter1 value = " + counter1.value());

//      Increase counter by 5. Result should be 0
        counter1.increase(5);
        System.out.println("Counter1 value = " + counter1.value());

//      Should return error message and result stays 0
        counter1.increase(-2);
        System.out.println("Counter1 value = " + counter1.value());

//      Should return error message and result stays 0
        counter1.decrease(-3);
        System.out.println("Counter1 value = " + counter1.value());


//      Constructor that starts with predetermined value
        Counter counter2 = new Counter(5);
        System.out.println("Counter2 value = " + counter2.value());

//      Decrease counter by 1. Result should be 4.
        counter2.decrease();
        System.out.println("Counter2 value = " + counter2.value());

//      Decrease counter by 5. Result should be -1
        counter2.decrease(5);
        System.out.println("Counter2 value = " + counter2.value());

//      Increase counter by 1. Result should be 0
        counter2.increase();
        System.out.println("Counter2 value = " + counter2.value());

//      Increase counter by 5. Result should be 5.
        counter2.increase(5);
        System.out.println("Counter2 value = " + counter2.value());

//      Should return error message and result stays 5
        counter2.increase(-2);
        System.out.println("Counter2 value = " + counter1.value());

//      Should return error message and result stays 5
        counter2.decrease(-3);
        System.out.println("Counter2 value = " + counter1.value());
    }
}

