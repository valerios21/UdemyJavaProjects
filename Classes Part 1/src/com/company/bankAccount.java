package com.company;

public class bankAccount {

    private double balance;
    private String customerName;
    private String email;
    private int phone;
    private int accNumber;

    public bankAccount(String customerName, String email, int phone) {
        this(9999, 100.55, customerName, email, phone);
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }

    public bankAccount() {
        this(1, 5, "Default name", "default address", 0);
        System.out.println("Empty constructor called");
    }

    public bankAccount(int accNumber, double balance, String customerName, String email, int phone ){

        this.accNumber = accNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;

    }

    /* Getters --------------------------------------------------*/
    public int getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }

    /* Setters --------------------------------------------------*/
    public void setBalance(double balance) {
        this.balance = balance;

    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public void depositFunds(double balanceAdd){
        this.balance += balanceAdd;
        System.out.println("Deposit of "+ balanceAdd + " was made. New balance is " + this.balance);
    }

    public void withdrawFunds(double balanceMinus){

        if(this.balance - balanceMinus < 0){
            System.out.println("Only this amount is available for withdrawal " + this.balance);
        }else {
            this.balance -= balanceMinus;
            System.out.println("Withdrawal of " + balanceMinus + " processed. Remaining balance is " + this.balance);
        }
    }

}
