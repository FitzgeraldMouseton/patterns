package structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {

    protected String name;
    protected String url;
    protected final List<MenuComponent> components = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public abstract String toString();

    String print() {
        return name + ": " + url + "\n";
    }
}
