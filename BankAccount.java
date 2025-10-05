public class BankAccount
{
    private double balance;
    /**
     * Constructs a BankAccount with an initial balance.
     * @param balance The starting balance of the account.
     */
    public BankAccount(double balance)
    {
        this.balance = balance;
    }
    /**
     * Retrieves the current balance of the account.
     * @return The current balance.
     */
    public double getBalance()
    {
        return balance;
    }
    /**
     * Deposits a specified amount into the account.
     * @param amount The amount to deposit.
     */
    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    /**
     * Withdraws a specified amount from the account.
     * @param amount The amount to withdraw.
     */
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }
    public String toString()
    {
        String str = "balance=";
        return str + balance;
    }
}
