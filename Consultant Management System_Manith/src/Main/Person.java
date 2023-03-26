package Main;

import java.util.Date;

public class Person {
    //setting the person attributes
    private String name;
    private String surname;
    private Date dateOfBirth;
    private int mobileNumber;

    public Person() {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.mobileNumber = mobileNumber;
    }

    public Person(String name, String surname, String dateOfBirth, int mobileNumber) {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getFullName() {
        return name + " " + surname;
    }
}
