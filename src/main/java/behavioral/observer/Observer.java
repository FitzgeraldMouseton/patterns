package behavioral.observer;

// Observer - объект, который наблюдает
public abstract class Observer {

    protected Subject subject;
    abstract void update();
}
