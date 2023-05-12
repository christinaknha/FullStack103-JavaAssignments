package OverloadingPractice;

public class Counter {
    private int value;

//  Create constructors
    public Counter(int startValue){
        this.value = startValue;
    }

    public Counter(){

    }

//  method called value. returns current value
    public int value(){
        return value;
    }

    public void increase(){
        value = value + 1;
    }

    public void increase(int increaseBy){
        if (increaseBy >= 0){
            value = value + increaseBy;
        } else{
            value = value + 0;
        }
    }

    public void decrease(){
        value = value - 1;
    }

    public void decrease(int decreaseBy){
        if (decreaseBy > 0){
            value = value - decreaseBy;
        } else{
            value = value - 0;
        }
    }

}

