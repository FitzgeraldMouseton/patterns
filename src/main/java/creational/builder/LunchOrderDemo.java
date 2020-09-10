package creational.builder;

public class LunchOrderDemo {
    public static void main(String[] args) {

        LunchOrder.Builder builder = new LunchOrder.Builder();
        final LunchOrder order = builder.bread("Borodinskij").meat("Govyadina").build();
        System.out.println(order.getBread());
    }
}
