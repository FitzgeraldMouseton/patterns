package creational.singleton;

public class SingletonDemo {

    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1);
        System.out.println(instance == instance1);
        System.out.println(" =4" + 2 + 2);
        Thread thread = new Thread(new Thread());
    }
}
