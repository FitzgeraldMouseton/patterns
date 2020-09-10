package inheritance;

public class Goat extends Domestics {
    public Goat(double weight) {
        super(weight);
    }

    @Override
    public void voice() {
        System.out.println("Beeee! I am a goat!");
    }

    @Override
    public void eat() {

    }
}
