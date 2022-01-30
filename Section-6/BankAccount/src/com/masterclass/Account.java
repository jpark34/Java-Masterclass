package com.masterclass;

public class Account {

    // fields for Account class
    private int account_num;
    private int balance;
    private String customer_name;
    private String email;
    private String phone_num;

        // Creating my own constructor for the account object
    public Account() {
        // this is a special use of this in order to call another constructor
        this(000, 0, "Default", "Default", "Default");
        System.out.println("Empty Constructor Called");
    }

    public Account(String customer_name, String email, String phone_num) {
        this(000, 0, customer_name, email, phone_num);
    }

        // Major Constructor
    public Account(int number, int balance, String customer_name, String email, String phone_num) {
        this.account_num = number;
        this.balance = balance;
        this.customer_name = customer_name;
        this.email = email;
        this.phone_num = phone_num;
        System.out.println("Created Constructor Worked");
    }

    public void setAccount_num(int account_num) {
        this.account_num = account_num;
    }

    public int getAccount_num() {
        return account_num;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void deposit(int funds) {
        balance += funds;
    }

    public String withdraw(int funds) {
        int after_balance = balance - funds;

        if (after_balance < 0) {
            String insufficient = "Insufficient Funds. Balance is currently: " + balance;
            return insufficient;
        }

        String sufficient = "Leftover balance is: " + after_balance;
        return sufficient;
    }
}
