package inheritance;

public abstract class Domestics implements Animal {

    private double weight;

    public abstract void eat();

    public Domestics(double weight) {
        this.weight = weight;
    }

    public Domestics() {
    }
}
