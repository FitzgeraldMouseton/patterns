package creational.abstractfactory.visa;

import creational.abstractfactory.CardType;
import creational.abstractfactory.CreditCard;
import creational.abstractfactory.CreditCardFactory;
import creational.abstractfactory.Validator;

public class VisaFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
			case GOLD:
				
				return new VisaGoldCreditCard();
	
			case PLATINUM:
				
				return new VisaBlackCreditCard();	
			
		}
		
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		return new VisaValidator();
	}

}
