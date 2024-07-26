package org.example;

public class CounterMain {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        System.out.println();
        System.out.println("Starting Value" + " " + counter1.value());
        System.out.println();
        counter1.increase();
        System.out.println("After Increase" + " " + counter1.value());

        Counter counter2 = new Counter(5);
        System.out.println();
        System.out.println("Initial Value" + " " + counter2.value());
        System.out.println();
        counter2.decrease();
        System.out.println("After Increase" +" " +  counter2.value());
    }
}
