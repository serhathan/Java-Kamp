package Entities;

import Abstracts.BaseGamerManager;

import java.time.LocalDate;

public class Gamer  {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthOfDay;
    private String nationalityIdentity;

    public Gamer(int id, String firstName, String lastName, LocalDate birthOfDay, String nationalityIdentity) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthOfDay = birthOfDay;
        this.nationalityIdentity = nationalityIdentity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDate getBirthOfDay() {
        return birthOfDay;
    }

    public void setBirthOfDay(LocalDate birthOfDay) {
        this.birthOfDay = birthOfDay;
    }

    public String getNationalityIdentity() {
        return nationalityIdentity;
    }

    public void setNationalityIdentity(String nationalityIdentity) {
        this.nationalityIdentity = nationalityIdentity;
    }
}
