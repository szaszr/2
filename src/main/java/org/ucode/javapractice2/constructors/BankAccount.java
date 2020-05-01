package org.ucode.javapractice2.constructors;

/*
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.
 */

public class BankAccount {

    private int accNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this(123456,0.0,"Default customer", "Default email","Default Phone number");
        System.out.println("empty");
    }

    public BankAccount(int accNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit (double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit successful. New balance is "+this.balance);
    }

    public void withdraw (double withdrawAmount){
        if (withdrawAmount>this.balance){
            System.out.println("Insufficient funds. There is only "+this.balance+" in the account.");
        }
        else{
            this.balance -= withdrawAmount;
            System.out.println("Withdrawal successful. New balance is "+this.balance);
        }
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
