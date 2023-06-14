package bankproject_iv;

import java.time.LocalDate;

/*
public class BankDatabase {
    public boolean checkClientValidity(Applicant applicant) {
        // Verificar la antigüedad mínima del cliente (6 meses)
        // Simulación: consideramos que la fecha actual es 6 meses después de la fecha de registro del cliente
        LocalDate currentDate = LocalDate.now();
        LocalDate sixMonthsAgo = currentDate.minusMonths(6);
        // Simulación: supongamos que el cliente con RUT "123456789" cumple con la antigüedad mínima
        return applicant.getRut().equals("123456789") && applicant.getRegistrationDate().isBefore(sixMonthsAgo);
    }

    public boolean checkLoanAmountValidity(Applicant applicant, double loanAmount) {
        // Verificar que el monto del crédito no exceda el 150% del sueldo del cliente
        // Simulación: supongamos que el cliente con RUT "123456789" tiene un sueldo de $600,000
        double clientSalary = 600000;
        return applicant.getRut().equals("123456789") && loanAmount <= (1.5 * clientSalary);
    }
}
*/
