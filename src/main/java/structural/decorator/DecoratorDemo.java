package structural.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {

        Sandwich sandwich = new MeatDecorator(new DressingDecorator(new SimpleSandwich()));

        System.out.println(sandwich.make());
    }
}
