package Task4.Question3;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount myAccount=new BankAccount();
        System.out.println("The initial balance is: "+myAccount.getBalance());

        myAccount.deposit(200.0);
        System.out.println("The Amount After Depositing "+myAccount.getBalance());

        myAccount.withdraw(400.0);
            System.out.println("The Amount After Withdraw "+myAccount.getBalance());

    }
}
