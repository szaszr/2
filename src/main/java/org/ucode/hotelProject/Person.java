package org.ucode.hotelProject;

public abstract class Person {
    private String firstName;
    private String lastName;
    private IdentityCard identityCard;

    public Person(String firstName, String lastName, IdentityCard identityCard) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityCard = identityCard;
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

    public IdentityCard getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(IdentityCard identityCard) {
        this.identityCard = identityCard;
    }
}
