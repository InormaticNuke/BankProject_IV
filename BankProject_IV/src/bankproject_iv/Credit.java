package bankproject_iv;

import java.util.Date;

public abstract class Credit {
    private String creditNumber;
    private Applicant applicant;
    private double loanAmount;
    private int installmentCount;
    private Date authorizationDate;
    private Date possibleDeliveryDate;
    private boolean approved;
    private double interestRate;

    public Credit() {
    }

    public Credit(String creditNumber, Applicant applicant, double loanAmount, int installmentCount, Date authorizationDate, Date possibleDeliveryDate, boolean approved, double interestRate) {
        this.creditNumber = creditNumber;
        this.applicant = applicant;
        this.loanAmount = loanAmount;
        this.installmentCount = installmentCount;
        this.authorizationDate = authorizationDate;
        this.possibleDeliveryDate = possibleDeliveryDate;
        this.approved = approved;
        this.interestRate = interestRate;
    }

    public String getCreditNumber() {
        return creditNumber;
    }

    public void setCreditNumber(String creditNumber) {
        this.creditNumber = creditNumber;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getInstallmentCount() {
        return installmentCount;
    }

    public void setInstallmentCount(int installmentCount) {
        this.installmentCount = installmentCount;
    }

    public Date getAuthorizationDate() {
        return authorizationDate;
    }

    public void setAuthorizationDate(Date authorizationDate) {
        this.authorizationDate = authorizationDate;
    }

    public Date getPossibleDeliveryDate() {
        return possibleDeliveryDate;
    }

    public void setPossibleDeliveryDate(Date possibleDeliveryDate) {
        this.possibleDeliveryDate = possibleDeliveryDate;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }


    public abstract void captureData();
    public abstract void printDetails();
    public abstract Date calculatePaymentDate();
}
