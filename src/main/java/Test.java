import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) throws ParserConfigurationException {

        Person origin = new Person("Avo");
        ArrayList<String> friends = new ArrayList<>();
        friends.add("v");
        friends.add("n");
        origin.setFriends(friends);
        Person clone = new Person(origin);

        clone.getFriends().add("k");
        origin.getFriends().forEach(System.out::println);

        double a = 7.7;
        float b = (float) a;

        int c = 32768;
        short d = (short) c;
        System.out.println(d);
    }
}
