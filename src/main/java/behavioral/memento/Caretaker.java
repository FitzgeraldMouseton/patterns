package behavioral.memento;

import java.util.ArrayDeque;
import java.util.Deque;

// caretaker - объект, хранящий состояния сохраняемого объекта
public class Caretaker {

    private final Deque<PersonMemento> personHistory = new ArrayDeque<>();

    public void save(Person person) {
        personHistory.push(person.save());
    }

    public void revert(Person person) {
        person.revert(personHistory.pop());
    }
}
