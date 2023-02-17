package com.techelevator;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountName, String accountNumber){
        super(accountName, accountNumber);
    }
    public SavingsAccount(String accountName, String accountNumber, int balance){
        super(accountName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw){
        int remainingBalance = getBalance() -  amountToWithdraw;
        int serviceCharge = 2;
        if(remainingBalance < 150){

            if(remainingBalance - serviceCharge < 0){
                return super.withdraw(0);
            }
            amountToWithdraw += serviceCharge;
          return super.withdraw(amountToWithdraw);
        }else {

            return super.withdraw(amountToWithdraw);
        }

    }

}
