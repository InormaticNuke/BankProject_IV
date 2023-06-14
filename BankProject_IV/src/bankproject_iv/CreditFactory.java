package bankproject_iv;

import java.util.Random;

public class CreditFactory {
    private static CreditFactory instance;

    private CreditFactory() {}

    public static CreditFactory getInstance() {
        if (instance == null) {
            instance = new CreditFactory();
        }
        return instance;
    }

    public Credit createCredit(String type) {
        if (type.equalsIgnoreCase("personal")) {
            return new PersonalCredit();
        } else if (type.equalsIgnoreCase("mortgage")) {
            return new MortgageCredit();
        } else if (type.equalsIgnoreCase("automotive")) {
            return new AutomotiveCredit();
        } else {
            throw new IllegalArgumentException("Tipo de crédito no válido.");
        }
    }

    public String generateCreditNumber() {
        // Generar un número de crédito aleatorio
        Random random = new Random();
        return String.valueOf(random.nextInt(1000000));
    }
}
