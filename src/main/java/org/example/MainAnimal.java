package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class MainAnimal {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>(); // Store Animal objects
        Scanner scanner = new Scanner(System.in); // Read user input

        // Loop to read animal details from the user
        while (true) {
            System.out.print("Enter the name of your animal (or press Enter to stop): ");
            String name = scanner.nextLine().trim(); // Read and trim name input

            if (name.isEmpty()) { // Stop if name is empty
                break;
            }

            boolean isDog = false;
            // Loop to read if the animal is a dog
            while (true) {
                System.out.print("Is it a dog? (yes/no): ");
                String isDogInput = scanner.nextLine().trim().toLowerCase();

                if (isDogInput.equals("yes")) {
                    isDog = true;
                    break;
                } else if (isDogInput.equals("no")) {
                    isDog = false;
                    break;
                } else {
                    System.out.println("Please enter 'yes' or 'no'.");
                }
            }

            animals.add(new Animal(name, isDog)); // Add Animal object using full constructor
        }

        // Add objects using overloaded constructors
        animals.add(new Animal("Cat")); // Using the overloaded constructor with name only
        animals.add(new Animal()); // Using the overloaded constructor with no parameters

        System.out.println("\nAnimals entered:");
        for (Animal animal : animals) { // Print details of animals
            System.out.println(animal);
        }

        scanner.close(); // Close scanner
    }
}
