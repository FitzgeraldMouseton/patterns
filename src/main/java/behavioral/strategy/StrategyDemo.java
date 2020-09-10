package behavioral.strategy;

/**
 * Strategy довольно схож с State. Основное отличие в том, что объекту передается не состояние, а некоторый алгоритм.
 * (Class per Algorithm instead of Class per State). Но алгоритмы независимы и не знают друг о друге, а состояние
 * знает о следующем состоянии.
 * Показательным примером стратегии является метод сортировки, в который перелается алгоритм, в соответствии с которым
 * нужно сортировать. Так же отличием является то, что клиент знает о стратегии, и ее нужно явно передавать.
 */
public class StrategyDemo {
    public static void main(String[] args) {

        CreditCard amexCard = new CreditCard(new AmexStrategy());
        amexCard.setNumber("379185883464283");
        amexCard.setDate("04/22");
        amexCard.setCvv("777");

        CreditCard visaCard = new CreditCard(new VisaStrategy());
        visaCard.setNumber("4539589763663402");
        visaCard.setDate("04/22");
        visaCard.setCvv("777");

        System.out.println("Amex card is valid: " + amexCard.isValid());
        System.out.println("Visa card is valid: " + visaCard.isValid());
    }
}
