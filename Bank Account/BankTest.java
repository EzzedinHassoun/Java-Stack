public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        
        account1.Deposit(500);
        account1.Deposit(500);
        account1.DepositSaving(1000);
        account1.WithdrawSaving(200);
        System.out.println(account1.getSavingsBalance());
        System.out.println(account1.getCheckingBalance());
        System.out.println(BankAccount.getTotalMoney());
        System.out.println(BankAccount.getAccounts());

       

    }
}




