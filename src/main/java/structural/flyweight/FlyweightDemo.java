package structural.flyweight;

// Паттерн применяется в тех случаях, когда нужно оперировать большим множеством одинаковых объектов
// Паттерн нужен для оптимизации памяти и работает с неизменяемыми объектами
public class FlyweightDemo {
    public static void main(String[] args) {

        InventorySystem ims = new InventorySystem();

        ims.takeOrder("TV", 221);
        ims.takeOrder("Radio-7", 317);
        ims.takeOrder("Radio-7", 335);
        ims.takeOrder("Laptop-2", 335);

        ims.process();
        System.out.println(ims.report());
    }
}
