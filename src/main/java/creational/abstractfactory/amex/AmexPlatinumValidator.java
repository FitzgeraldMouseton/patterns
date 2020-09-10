package creational.abstractfactory.amex;

import creational.abstractfactory.CreditCard;
import creational.abstractfactory.Validator;

public class AmexPlatinumValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		
		return false;
	}

}
