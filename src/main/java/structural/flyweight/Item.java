package structural.flyweight;

// Instances of Item will be Flyweights
public class Item {

    // Объект по сути должен быть неизеняемым
    private final String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
