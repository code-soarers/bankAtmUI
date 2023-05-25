package BankUI;

public class SavingsAccount extends Account{
    int account_Balance = 50000;

    public boolean saving_withdrawal(int amount) {
        boolean withdraw;
        if(amount>20000){
            withdraw=false;
        }
        else{
            withdraw=true;
            account_Balance=account_Balance-amount;
        }
        return withdraw;
    }

    int checkBalance(){
        return  account_Balance;
    }
}
