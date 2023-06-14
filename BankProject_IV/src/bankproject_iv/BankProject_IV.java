package bankproject_iv;

import java.util.Date;

public class BankProject_IV{
    public static void main(String[] args) {

        CreditFactory creditFactory = CreditFactory.getInstance();
        Credit personalCredit = creditFactory.createCredit("personal");
        personalCredit.captureData();
        personalCredit.printDetails();
        Date paymentDate = personalCredit.calculatePaymentDate();

        BankDatabase bankDatabase = new BankDatabase();
        boolean isClientValid = bankDatabase.checkClientValidity(personalCredit.getApplicant());
        boolean isLoanAmountValid = bankDatabase.checkLoanAmountValidity(personalCredit.getApplicant(), personalCredit.getLoanAmount());

        if (isClientValid && isLoanAmountValid) {
            personalCredit.setApproved(true);
            personalCredit.setInterestRate(1.85);
            System.out.println("El crédito ha sido aprobado.");
        } else {
            personalCredit.setApproved(false);
            System.out.println("El crédito ha sido rechazado.");
        }

        // ...
    }
}
