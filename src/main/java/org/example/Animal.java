package org.example;

public class Animal {
    private String name;
    private boolean isDog;

    // Constructor with all parameters
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    // Overloaded constructor with only the name
    public Animal(String name) {
        this.name = name;
        this.isDog = false; // Default value
    }

    // Overloaded constructor with no parameters
    public Animal() {
        this.name = "Unknown"; // Default value
        this.isDog = false; // Default value
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public boolean isDog() {
        return isDog;
    }

    // toString method
    @Override
    public String toString() {
        return "Animal{name='" + name + "', isDog=" + isDog + "}";
    }
}
