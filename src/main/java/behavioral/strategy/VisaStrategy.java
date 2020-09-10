package behavioral.strategy;

public class VisaStrategy extends ValidationStrategy {

    @Override
    public boolean isValid(CreditCard card) {
        boolean isValid;
        isValid = card.getNumber().startsWith("4");

        if (isValid) {
            isValid = card.getNumber().length() == 16;
        }

        if (isValid) {
            isValid = passLuhn(card.getNumber());
        }
        return isValid;
    }
}
