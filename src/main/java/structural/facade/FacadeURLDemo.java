package structural.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class FacadeURLDemo {
    public static void main(String[] args) throws IOException {

        URL url = new URL("http", "www.pluralsight.com", 80, "/author/bryan-hansen");

        try (final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                System.out.println(string + "\n");
            }
        }
    }
}
