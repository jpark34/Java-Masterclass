package com.masterclass;

public class Main {

    public static void main(String[] args) {
	    Account customer = new Account();
        customer.setBalance(10);
        System.out.println("starting balance = " + customer.getBalance());
        customer.deposit(10);
        System.out.println("balance after deposit = " + customer.getBalance());
        System.out.println(customer.withdraw(21));
        System.out.println(customer.withdraw(15));

        Account customer1 = new Account(2, 0, "Bobby", "email", "1234567890");

        Account customer2 = new Account("Tim", "Tim email", "123");
        System.out.println(customer2.getCustomer_name());
        System.out.println("\n");

        VipCustomer vip1 = new VipCustomer();
        System.out.println(vip1.getName());

        VipCustomer vip2 = new VipCustomer("Bob", 5000.00);
        System.out.println(vip2.getName());

        VipCustomer vip3 = new VipCustomer("Jon", 500.00, "email");
        System.out.println(vip3.getName());
    }
}
