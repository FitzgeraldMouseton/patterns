package structural.bridge.printerbridge;

import java.util.List;

public class MoviePrinter extends Printer {

    private final Movie movie;

    public MoviePrinter(Movie movie) {
        this.movie = movie;
    }

    @Override
    protected List<Detail> getDetails() {
        return List.of(new Detail("Title", movie.getTitle()),
                        new Detail("Year", movie.getYear()),
                        new Detail("Runtime", movie.getRuntime()));
    }

    @Override
    protected String getHeader() {
        return movie.getClassification();
    }
}
