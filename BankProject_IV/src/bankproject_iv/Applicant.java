package bankproject_iv;

import java.time.LocalDate;

public class Applicant implements INTERFACE_UPDATE {

    private String rut;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String homeAddress;
    private String workAddress;
    
    private LocalDate registrationDate;

    public Applicant() {
    }

    public Applicant(String rut, String firstName, String lastName, String phoneNumber, String homeAddress, String workAddress, LocalDate registrationDate) {
        this.rut = rut;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
        this.registrationDate = registrationDate;
        
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
    
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }
    
    public void update(){
        System.out.println("Your credit results are ready");
    }

}
