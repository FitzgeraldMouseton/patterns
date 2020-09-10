package inheritance;

public class Dog extends Domestics {

    @Override
    public void voice() {
        System.out.println("Woof! Woof! I am a dog");
    }

    @Override
    public void eat() {
        //weight +=1;
        //System.out.println(weight);
        System.out.println("I am a dog. I'm eating");
    }

    public static void catchBee(){
        System.out.println("Got you!");
    }
}
