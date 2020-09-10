package structural.bridge.printerbridge;

public class BridgeDemo {
    public static void main(String[] args) {

        Movie movie = new Movie("cartoon", "12:56", "12 oz. mouse", "2005");

        Formatter formatter = new PrintFormatter();
        Formatter htmlFormatter = new HtmlFormatter();
        Printer moviePrinter = new MoviePrinter(movie);
        final String printedMaterial = moviePrinter.print(formatter);
        final String htmlPrintedMaterial = moviePrinter.print(htmlFormatter);
        System.out.println(printedMaterial);
        System.out.println(htmlPrintedMaterial);
    }
}
