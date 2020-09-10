package behavioral.memento;

//originator - объект, который мы хотим сохранить
public class Person {

    private String name;
    private String address;
    private String phone;

    public PersonMemento save() {
        return new PersonMemento(name, phone);
    }

    public void revert(PersonMemento memento) {
        this.name = memento.getName();
        this.phone = memento.getPhone();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
