package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTvShow {
    public static void main(String[] args) {
        ArrayList<TvShow> tvShows = new ArrayList<>(); // Store TvShow objects
        Scanner scanner = new Scanner(System.in); // Read user input

        // Loop to read TV show details from the user
        while (true) {
            System.out.print("Name of the show: ");
            String showName = scanner.nextLine().trim(); // Read and trim show name input

            if (showName.isEmpty()) { // Stop if show name is empty
                break;
            }

            int numberOfEpisodes = 0;
            boolean useOverloadedConstructor = false;

            System.out.print("How many episodes? (press Enter to skip): ");
            String episodesInput = scanner.nextLine().trim();
            if (!episodesInput.isEmpty()) {
                try {
                    numberOfEpisodes = Integer.parseInt(episodesInput); // Parse to integer
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number entered. Defaulting to 0 episodes.");
                }
            } else {
                useOverloadedConstructor = true;
            }

            System.out.print("What is the genre? ");
            String genre = scanner.nextLine().trim();

            if (useOverloadedConstructor) {
                tvShows.add(new TvShow(showName, genre)); // Using the overloaded constructor
            } else {
                tvShows.add(new TvShow(showName, numberOfEpisodes, genre)); // Using the full constructor
            }
        }

        // Add objects using overloaded constructors
        tvShows.add(new TvShow("Breaking Bad")); // Using the overloaded constructor with showName only
        tvShows.add(new TvShow()); // Using the overloaded constructor with no parameters

        System.out.println("\nTV Shows entered:");
        for (TvShow tvShow : tvShows) { // Print details of TV shows
            System.out.println(tvShow);
        }

        scanner.close(); // Close scanner
    }
}
