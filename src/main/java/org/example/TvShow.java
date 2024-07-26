package org.example;

public class TvShow {
    private String showName;
    private int numberOfEpisodes;
    private String genre;

    // Constructor with all parameters
    public TvShow(String showName, int numberOfEpisodes, String genre) {
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }

    // Overloaded constructor with only the showName and genre
    public TvShow(String showName, String genre) {
        this.showName = showName;
        this.numberOfEpisodes = 0; // Default value
        this.genre = genre;
    }

    // Overloaded constructor with only the showName
    public TvShow(String showName) {
        this.showName = showName;
        this.numberOfEpisodes = 0;
        this.genre = "Unknown";
    }

    // Overloaded constructor with no parameters
    public TvShow() {
        this.showName = "Unknown";
        this.numberOfEpisodes = 0;
        this.genre = "Unknown";
    }

    // Getters
    public String getShowName() {
        return showName;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public String getGenre() {
        return genre;
    }

    // toString method
    @Override
    public String toString() {
        return "TvShow{showName='" + showName + "', numberOfEpisodes=" + numberOfEpisodes + ", genre='" + genre + "'}";
    }
}
