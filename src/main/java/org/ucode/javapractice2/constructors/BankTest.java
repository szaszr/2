package org.ucode.javapractice2.constructors;

public class BankTest {
    public static void main(String[] args) {
        BankAccount robertsAccount = new BankAccount(12345,0.0,"Robert","email@email.com","0712345679");


        robertsAccount.withdraw(100);
        robertsAccount.deposit(50);
        robertsAccount.withdraw(100);
        robertsAccount.deposit(51);
        robertsAccount.withdraw(100);

        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("Sam", 2500);
        System.out.println(customer2.getName());

        VipCustomer customer3 = new VipCustomer("Andrew", 100,"random@email.com");
        System.out.println(customer3.getName());
    }
}
