package creational.prototype;

public class PrototypeDemo {

    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational Patterns of Java");

        System.out.println(movie);
        System.out.println(movie.getRunTime());
        System.out.println(movie.getUrl());
        System.out.println(movie.getTitle());

        Movie anotherMovie = (Movie) registry.createItem("Movie");
        anotherMovie.setTitle("Gang of Four");

        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getRunTime());
        System.out.println(anotherMovie.getUrl());
        System.out.println(anotherMovie.getTitle());
        
        Book book = (Book) registry.createItem("Book");
    }


}
