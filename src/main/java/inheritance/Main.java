package inheritance;

public class Main {

    public static void main(String[] args) {

        Dog domestics = new SheepDog("Black");

        domestics.voice();
        domestics.eat();

//        domestics.sheeping();
//        System.out.println(domestics.getColour());

        SheepDog.catchBee();
        domestics.catchBee();

        double f = Math.round(Math.PI * 100.0) / 100.0;
        System.out.println(f);
    }
}
