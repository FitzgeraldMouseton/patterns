package structural.adapter;

public class PersonDB implements Person {

    private final String id;
    private final String name;
    private final String occupation;

    public PersonDB(String id, String name, String occupation) {
        this.id = id;
        this.name = name;
        this.occupation = occupation;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getOccupation() {
        return occupation;
    }

    @Override
    public String toString() {
        return "PersonDB{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
