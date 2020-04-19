package org.ucode.hotelProject;

public class Customer extends Person {
    private String email;
    private boolean isLoyalMember;

    public Customer(String firstName, String lastName, IdentityCard identityCard, String email, boolean isLoyalMember) {
        super(firstName, lastName, identityCard);
        this.email = email;
        this.isLoyalMember = isLoyalMember;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isLoyalMember() {
        return isLoyalMember;
    }

    public void setLoyalMember(boolean loyalMember) {
        isLoyalMember = loyalMember;
    }
}
