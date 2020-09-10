package inheritance;

public class SheepDog extends Dog {

    private String colour;

    public SheepDog(String colour) {
        this.colour = colour;
    }

    @Override
    public void voice() {
        System.out.println("HufioMufufff!");
    }

    @Override
    public void eat() {
        //weight +=1;
        //System.out.println(weight);
        System.out.println("I am a dog. I'm eating");
    }

    public void sheeping(){
        System.out.println("I am sheeping sheep");
    }

    public String getColour() {
        return colour;
    }

    public static void catchBee(){
        System.out.println("Yeah, got you!");
    }
}
