import java.util.ArrayList;

public class Person {

    private String name;
    private ArrayList<String> friends;

    public Person(String name) {
        this.name = name;
    }

    public Person(Person origin){
        this.name = origin.getName();
        this.friends = new ArrayList<>(origin.getFriends());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<String> friends) {
        this.friends = friends;
    }
}
