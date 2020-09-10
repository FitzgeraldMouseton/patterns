package behavioral.strategy;

public class AmexStrategy extends ValidationStrategy {

    @Override
    public boolean isValid(CreditCard card) {
        boolean isValid;
        isValid = card.getNumber().startsWith("37") || card.getNumber().startsWith("34");

        if (isValid) {
            isValid = card.getNumber().length() == 15;
        }

        if (isValid) {
            isValid = passLuhn(card.getNumber());
        }
        return isValid;
    }
}
