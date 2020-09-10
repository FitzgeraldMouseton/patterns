package structural.composite;

// Composite
public class Menu extends MenuComponent {

    public Menu(String name, String url) {
        this.name = name;
        this.url = url;
    }

    // Возвращать MenuComponent не обязательно, просто для удобства
    public MenuComponent add(MenuComponent component) {
        components.add(component);
        return component;
    }

    public MenuComponent remove(MenuComponent component) {
        components.remove(component);
        return component;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(print());

        for (MenuComponent menuComponent : components) {
            builder.append(menuComponent.toString());
        }
        return builder.toString();
    }
}
