package Task4.Question3;

class BankAccount {
    private long accountNumber;
    private double balance;

    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            System.out.println("The amount  Deposited is: "+amount);
            balance += amount;

        }
        else{
            System.out.println("The deposit amount should be Positive");
        }

    }

    public void withdraw(double amount){
        if(amount>0&&amount<=balance){
            System.out.println("The amount withdraw is: "+amount);
            balance-=amount;
           //
        }
        else{
            System.out.println("Insufficient bank balance");
        }
    }
    public double getBalance() {
        return balance;
    }

    public double getAccountNumber() {
        return accountNumber;
    }
}
