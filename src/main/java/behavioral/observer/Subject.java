package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// Subject (observable) - объект, за которым наблюдают (слушают его события)
public abstract class Subject {

    private final List<Observer> observers = new ArrayList<>();
    abstract void setState(String state);
    abstract String getState();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(Observer::update);
    }
}
