package com.techelevator;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountHolderName, String accountNumber){
        super(accountHolderName,accountNumber);
    }

    public CheckingAccount(String accountName, String accountNumber, int balance){
        super(accountName,accountNumber,balance);
    }

    @Override
    public int withdraw(int amountToWithdraw){
        int currentBalance = getBalance();
        int overDraft = 10;
        if((currentBalance - amountToWithdraw) < 0 && (currentBalance - amountToWithdraw)> -100){
            amountToWithdraw += overDraft;
            return super.withdraw(amountToWithdraw);
        }else if ((currentBalance - amountToWithdraw) <= -100){
            return super.withdraw(0);
        }
        return super.withdraw(amountToWithdraw);
    }



}
