package Assignments.ClassObjectsConstructors;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    // Instance variables
    private String title;
    private String genre;
    private double rating;
    private int duration;

    // Static variable to track total movies
    private static int totalMovies = 0;

    // Constructor
    public Movie(String title, String genre, double rating, int duration) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.duration = duration;
        totalMovies++;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    public int getDuration() {
        return duration;
    }

    public static int getTotalMovies() {
        return totalMovies;
    }

    // Display details
    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                ", duration=" + duration + " minutes" +
                '}';
    }

    // Function to add movies and display
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();

        // Adding movies using constructor
        movies.add(new Movie("Inception", "Sci-Fi", 8.8, 148));
        movies.add(new Movie("Titanic", "Romance", 7.8, 195));
        movies.add(new Movie("The Godfather", "Crime", 9.2, 175));

        // Display all movies
        System.out.println("All Movies:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        // Display total movies
        System.out.println("Total Movies: " + Movie.getTotalMovies());
    }
}

