public class BankManagementSystem {
  public static void main(String[] args) {
    BankAccount account = new BankAccount();
       account.deposit(40000.4);
       account.withdraw(3000.3);


    System.out.println("Current Balance : "+ account.getBalance());
  }




}
