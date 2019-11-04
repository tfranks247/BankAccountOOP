package com.company;

import javafx.util.converter.CurrencyStringConverter;

import java.text.NumberFormat;

public class BankAccount {


    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("56789", 2.50, "Default name", "Default Address", "default phone");
        System.out.println("empty constructor called");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName, email, phoneNumber);
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        System.out.println("BankAccount constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmmount){
        this.balance += depositAmmount;
        System.out.println("Deposit of " + depositAmmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if(balance - withdrawalAmount < 0) {
            System.out.println("Only " + balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
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


