package com.company;

public class Main {

    public static void main(String[] args) {
//	// write your code here
//        BankAccount bobsBankAccount = new BankAccount(); // ("12345", 0.00, "Tony Tones", "myemail@tony.com", "301-555-5555");
//        System.out.println(bobsBankAccount.getAccountNumber());
//        System.out.println(bobsBankAccount.getBalance());
//
//        bobsBankAccount.withdrawal(100.0);
//
//        bobsBankAccount.deposit(50.0);
//
//        bobsBankAccount.withdrawal(100.0);
//
//        bobsBankAccount.deposit(51.0);
//
//        bobsBankAccount.withdrawal(100.0);
//
//        BankAccount tonysBankAccount = new BankAccount(" Tony ", "tony@tony.com", "12345");
//        System.out.println(tonysBankAccount.getAccountNumber() + " name " + tonysBankAccount.getCustomerName());

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Timmy", 25000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tony", 100.00, "tnigt@gdjng.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());


    }
}
