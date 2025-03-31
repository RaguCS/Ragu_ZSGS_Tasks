package Assignments.methodOverriding;

public class MovieMain {
public static void main(String[] args) {
    Movie movie1 = new RomComMovie();
    Movie movie2 = new ThrillerMovie();
    movie1.play();
    movie2.play();
}
}
class Movie {
    void play() { System.out.println("Playing a movie..."); }
}

class RomComMovie extends Movie {
    @Override
    void play() { System.out.println("Playing a Romantic Comedy Movie..."); }
}

class ThrillerMovie extends Movie {
    @Override
    void play() { System.out.println("Playing a Thriller Movie..."); }
}

