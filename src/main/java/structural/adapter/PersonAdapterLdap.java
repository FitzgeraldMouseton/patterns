package structural.adapter;

public class PersonAdapterLdap implements Person {

    private final PersonLdap instance;

    public PersonAdapterLdap(PersonLdap instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return String.valueOf(instance.getCn());
    }

    @Override
    public String getName() {
        return instance.getpName();
    }

    @Override
    public String getOccupation() {
        return instance.getpOccupation();
    }

    @Override
    public String toString() {
        return "PersonAdapterLdap{" +
                "instance=" + instance +
                '}';
    }
}
