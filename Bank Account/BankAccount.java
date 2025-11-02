public class BankAccount {

    // MEMBER VARIABLES
    private double checkingBalance=0;
    private double savingsBalance=0;
    private  int  accountnumber;
    private static int accounts =0;
    private static double totalMoney = 0; 
    
    // CONSTRUCTOR
    public BankAccount(){
        accounts+=1;
    }
    
    // GETTERS
    public static int getAccounts() {
        return accounts;
    }

    public static void setAccounts(int accounts) {
        BankAccount.accounts = accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    public static void setTotalMoney(double totalMoney) {
        BankAccount.totalMoney = totalMoney;
    }
    

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }


    // METHODS
    // deposit
    public void  Deposit(double salary){
        checkingBalance += salary;
        totalMoney += salary;
    }
    public void  DepositSaving(double savings){
        savingsBalance += savings;
        totalMoney += savings;

    }
    // withdraw 
    public double Withdraw(double salary){
        if(checkingBalance > salary){
            checkingBalance -= salary;
            totalMoney -= salary;

        }
        return checkingBalance;
    }
    public double WithdrawSaving(double savings){
        if(savingsBalance >= savings){
        savingsBalance -= savings;
        totalMoney -= savings;
    }   
    return savingsBalance;
    } 

// getBalance
public void  getBalance(){
    totalMoney = savingsBalance + checkingBalance;
}
}


