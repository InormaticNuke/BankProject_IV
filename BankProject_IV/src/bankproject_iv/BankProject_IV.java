package bankproject_iv;

import java.time.LocalDate;
import java.util.Date;

public class BankProject_IV{
    public static void main(String[] args) {
        
        Applicant applicant1 = new Applicant();
        applicant1.setRut("209074168");
        applicant1.setFirstName("Manuel");
        applicant1.setLastName("Rengifo");
        applicant1.setPhoneNumber("+56991786048");
        applicant1.setHomeAddress("Av Providencia");
        applicant1.setWorkAddress("Los Militares 6836");
        applicant1.setRegistrationDate(LocalDate.now());


        CreditFactory creditFactory = CreditFactory.getInstance();
        Credit personalCredit = creditFactory.createCredit("automotive");
        personalCredit.captureData();
        personalCredit.printDetails();
        Date paymentDate = personalCredit.calculatePaymentDate();

        /*
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

        */
    }
}
