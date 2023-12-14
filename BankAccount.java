public class BankAccount {
    private double balance;
    public String accountHolder;
    protected int accountNumber;

    public BankAccount(double balance, String accountHolder, int accountNumber) {
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposite(double amount)
    {
        if(amount>0){
            balance += amount;
            System.out.println(amount + " deposite Successfully. New balance: " + balance);

        }
        else{
            System.out.println("Invalid amount for deposite.");
        }
    }
}
