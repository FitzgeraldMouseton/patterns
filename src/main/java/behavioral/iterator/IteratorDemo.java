package behavioral.iterator;

import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {

        BikeRepository bikeRepository = new BikeRepository();

        bikeRepository.addBike("Cervelo");
        bikeRepository.addBike("Scott");
        bikeRepository.addBike("Fuji");

        final Iterator<String> iterator = bikeRepository.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
