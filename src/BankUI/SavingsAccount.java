package BankUI;

public class SavingsAccount extends Account{

    @Override
    public boolean withdrawal(int amount) {
        boolean withdraw;
        if(amount>20000){
            withdraw=false;
        }
        else{
            withdraw=true;
            accountBalance=accountBalance-amount;
        }
        return withdraw;
    }
}
