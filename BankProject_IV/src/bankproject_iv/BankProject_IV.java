package bankproject_iv;

import java.time.LocalDate;
import java.util.Date;

public class BankProject_IV{
    public static void main(String[] args) {
        
        
        OBSERVER_ALARM alarma1 = new OBSERVER_ALARM();
        alarma1.attach(new Applicant());
        
        
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
        
        COMPOSITE_TEST_COMPONENT testOne = new COMPOSITE_TEST_LEAF("TestSubject1", 1);
        COMPOSITE_TEST_COMPONENT testTwo = new COMPOSITE_TEST_LEAF("TestSubject2", 2);
        COMPOSITE_TEST_COMPONENT testThree = new COMPOSITE_TEST_LEAF("TestSubject3", 3);
        COMPOSITE_TEST_COMPONENT testFour = new COMPOSITE_TEST_LEAF("TestSubject4", 4);
        
        COMPOSITE_TEST_COMPOSITE testComp = new COMPOSITE_TEST_COMPOSITE("Test Comp");
        
        COMPOSITE_TEST_COMPOSITE testComp2 = new COMPOSITE_TEST_COMPOSITE("Test Comp 2");
        testComp2.add(testOne);
        testComp2.add(testTwo);
        
        COMPOSITE_TEST_COMPOSITE testComp3 = new COMPOSITE_TEST_COMPOSITE("Test Comp 3");
        testComp2.add(testThree);
        testComp2.add(testFour);
        
        testComp.add(testComp2);
        testComp.add(testComp3);
        
        testComp.testFunc();

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
