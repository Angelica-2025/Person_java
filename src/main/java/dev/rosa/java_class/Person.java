package dev.rosa.java_class;

public class Person {

    private String name;
    private String surname;
    private String idNumber;
    private int dateOfBirth;

    public Person(String name, String surname, String idNumber, int dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.idNumber = idNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getIdNumber() {
        return idNumber;
    }
    public int getDateOfBirth() {
        return dateOfBirth;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
