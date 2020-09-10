package creational.abstractfactory.amex;

import creational.abstractfactory.CreditCard;
import creational.abstractfactory.Validator;

public class AmexGoldValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		
		return false;
	}

}
