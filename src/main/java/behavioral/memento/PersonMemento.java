package behavioral.memento;

// memento - объект, в котором мы сохраняем состояние другого объекта. В данном случае мы сохраняем объект Person и два
// его поля (можем и три, но предположим, что нас интересуют только два).
public class PersonMemento {

    private String name;
    private String phone;

    public PersonMemento(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
