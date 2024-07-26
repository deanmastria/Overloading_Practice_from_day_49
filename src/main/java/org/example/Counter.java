package org.example;

public class Counter {
    public int startValue;
    public int currentValue;

    //Constructor to set start value to a given startValue
    public Counter(int startValue) {
        this.startValue = startValue;
        this.currentValue = startValue;
    }

    //Constructor the sets start value to 0
    public Counter() {
        this(0); //calls the other constructor with the startValue as 0
    }

    //Methods for increasing and decreasing counter values without returning anything
    public void increase() {
        currentValue++;
    }

    //Overloaded method
    public void increase(int increaseBy) {
        if(increaseBy > 0) {
            currentValue += increaseBy;
        }
    }

    public void decrease() {
        currentValue--;
    }

    //Overloaded method
    public void decrease(int decreaseBy) {
        if(decreaseBy > 0) {
            currentValue -= decreaseBy;
        }
    }

    //Method to return current value of counter
    public int value() {
        return currentValue;
    }

    public int getStartValue() {
        return startValue;

    }
}
