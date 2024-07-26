package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBook {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>(); // Store Book objects
        Scanner scanner = new Scanner(System.in); // Read user input

        // Loop to read book details from the user
        while (true) {
            System.out.print("Title of the book: ");
            String title = scanner.nextLine().trim(); // Read and trim title input

            if (title.isEmpty()) { // Stop if title is empty
                break;
            }

            int numberOfPages = 0;
            int publicationYear = 0;
            boolean useOverloadedConstructor = false;

            System.out.print("Number of pages (press Enter to skip): ");
            String pagesInput = scanner.nextLine().trim();
            if (!pagesInput.isEmpty()) {
                try {
                    numberOfPages = Integer.parseInt(pagesInput); // Parse to integer
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number entered. Defaulting to 0 pages.");
                }
            } else {
                useOverloadedConstructor = true;
            }

            System.out.print("Publication year (press Enter to skip): ");
            String yearInput = scanner.nextLine().trim();
            if (!yearInput.isEmpty()) {
                try {
                    publicationYear = Integer.parseInt(yearInput); // Parse to integer
                } catch (NumberFormatException e) {
                    System.out.println("Invalid year entered. Defaulting to 0.");
                }
            } else {
                useOverloadedConstructor = true;
            }

            // Add Book object using appropriate constructor
            if (useOverloadedConstructor) {
                books.add(new Book(title)); // Using the overloaded constructor
            } else {
                books.add(new Book(title, numberOfPages, publicationYear)); // Using the full constructor
            }
        }

        // Add objects using overloaded constructors
        books.add(new Book("The Great Gatsby")); // Using the overloaded constructor with title only
        books.add(new Book()); // Using the overloaded constructor with no parameters

        // Ask user what information to print
        System.out.print("\nWhat information will be printed? ");
        String printOption = scanner.nextLine().trim().toLowerCase();

        System.out.println(); // Print a blank line

        // Print details based on user's choice
        if (printOption.equals("everything")) {
            System.out.println("Books entered:");
            for (Book book : books) {
                System.out.println(book); // Print full details
            }
        } else if (printOption.equals("name")) {
            System.out.println("Book titles:");
            for (Book book : books) {
                System.out.println(book.getTitle()); // Print titles only
            }
        } else {
            System.out.println("Invalid option. Please enter 'everything' or 'name'.");
        }

        scanner.close(); // Close scanner
    }
}
