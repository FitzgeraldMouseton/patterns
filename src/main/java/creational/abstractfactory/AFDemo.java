package creational.abstractfactory;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class AFDemo {

	public static void main(String[] args) {
		
		CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
		
		CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
		
		System.out.println(card.getClass());
		
		abstractFactory = CreditCardFactory.getCreditCardFactory(600);
		
		CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);
		
		System.out.println(card2.getClass());


		Instant instant = Instant.ofEpochMilli(628468726);
		LocalDateTime time = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
	}

}
