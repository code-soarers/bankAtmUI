public class Account {
    int accountBalance=50000;
    public boolean withdrawal(int amount){
        boolean withdraw;
        if (amount<=accountBalance){
            withdraw=false;
        }
        else{
            withdraw=true;
            accountBalance=accountBalance-amount;

        }
        return withdraw;
    }

    public boolean deposit(int amount){
        boolean deposital;
        if (amount<=accountBalance){
            deposital=false;
        }
        else{
            deposital=true;
            accountBalance=accountBalance+amount;

        }
        return deposital;
    }

    int checkBalance(){
        return  accountBalance;
    }
}
