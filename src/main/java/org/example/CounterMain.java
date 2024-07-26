package org.example;

public class CounterMain {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        System.out.println();
        System.out.println("Starting Value" + " " + counter1.value());
        System.out.println();
        counter1.increase();
        System.out.println("After Increase by 1:" + " " + counter1.value());
        counter1.increase(2);
        System.out.println();
        System.out.println("After Increase by 2:" + " " + counter1.value());

        Counter counter2 = new Counter(9);
        System.out.println();
        System.out.println("Initial Value" + " " + counter2.value());
        System.out.println();
        counter2.decrease();
        System.out.println("After Decrease by 1:" + " " + counter2.value());
        counter2.decrease(2);
        System.out.println();
        System.out.println("After Decrease by 2:" + " " + counter2.value());

        System.out.println();

        counter1.increase(-3);
        System.out.println("Negative values will not alter the counter: " + counter1.value());
        counter2.decrease(-5);
        System.out.println("Negative values will not alter the counter: " + counter2.value());
    }
}
