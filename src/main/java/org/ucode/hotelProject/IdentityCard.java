package org.ucode.hotelProject;

import java.util.Date;

public class IdentityCard {
    private Date dateOfBirth;
    private String address;
    private String cnp;
    private Date issuedAt;
    private Date expiresAt;

    public IdentityCard(Date dateOfBirth, String address, String cnp, Date issuedAt, Date expiresAt) {
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.cnp = cnp;
        this.issuedAt = issuedAt;
        this.expiresAt = expiresAt;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public Date getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(Date issuedAt) {
        this.issuedAt = issuedAt;
    }

    public Date getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Date expiresAt) {
        this.expiresAt = expiresAt;
    }
}
