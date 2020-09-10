package behavioral.memento;

public class MementoDemo {
    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker();

        Person person = new Person();

        person.setName("Fitz");
        person.setAddress("Cheese street");
        person.setPhone("1-144-56-890");

        System.out.println("Person before save: " + person);

        caretaker.save(person);

        person.setPhone("2-144-56-890");

        caretaker.save(person);

        System.out.println("Person after changing phone: " + person);

        person.setPhone("3-144-56-890");  // <-- мы не вызываем save()

        caretaker.revert(person);

        System.out.println("Reverts to last save point: " + person);

        caretaker.revert(person);

        System.out.println("Reverted to the original: " + person);
    }
}
