package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankCustomer implements Accountable{
    private String name, address, phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public Accountable[] getAccounts(){
        return accounts.toArray(new Accountable[0]);

    }

    public void addAccount(Accountable newAccount){
        this.accounts.add(newAccount);


    }
    public boolean isVip() {
        int sumOfAccounts = 0;
        boolean isDebt = true;
        for (Accountable name : accounts) {
            sumOfAccounts += name.getBalance();
        }
        return sumOfAccounts >= 25000;
    }

    @Override
    public int getBalance() {
        return 0;
    }
}
