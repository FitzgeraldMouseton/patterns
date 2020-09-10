package structural.bridge.printerbridge;

import java.util.List;

// В отличие от примера с формами, здесь объект интерфейса передается не в конструкторе, а в простом методе
public abstract class Printer {

    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    protected abstract List<Detail> getDetails();

    protected abstract String getHeader();
}
