public class BankAccount {
   private double  balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(double amount){
       balance += amount;
        System.out.println("Deposite : "+ amount);
    }

    public void withdraw(double amount){
        if (balance < 0){
            System.out.println("Error");
        } else if (amount > balance) {
            System.out.println("Error");
        }
        else {
            balance -= amount;
            System.out.println("Withdraw : "+amount);
        }

    }

    public double getBalance() {
        return balance;
    }
}

