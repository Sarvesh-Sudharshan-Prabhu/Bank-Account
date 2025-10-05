public class CheckingAccount extends BankAccount
{
    private int transactions;
    private final int FREE_TRANSACTIONS;
    private final double TRANSACTION_FEE;
    /**
     *  Uses the specified double to set the initial balance of the CheckingAccount.
     * @param balance
     */
    public CheckingAccount(double balance)
    {
        super(balance);
        this.transactions = 0;
        this.FREE_TRANSACTIONS = 3;
        this.TRANSACTION_FEE = 2.0;
    }
    /**
     * Adds the specified double to the balance of the CheckingAccount and increase the number of transactions by one.
     * @param amount The amount to deposit.
     */
    public void deposit(double amount)
    {
        super.deposit(amount);
        transactions = transactions + 1;
    }
    /**
     * Deduct the specified double from the balance of
     * the CheckingAccount and increase the number of transactions by one.
     * @param amount The amount to withdraw.
     */
    public void withdraw(double amount)
    {
        super.withdraw(amount);
        transactions = transactions + 1;
    }
    /**
     * Deduct TRANSACTION_FEE from the CheckingAccount for each transaction over
     * FREE_TRANSACTIONS then set transactions to 0.
     */
    public void deductFees()
    {
        if (transactions > FREE_TRANSACTIONS)
        {
            int transactionDifference = transactions - FREE_TRANSACTIONS;
            withdraw(TRANSACTION_FEE * transactionDifference);
        }
        transactions = 0;
    }
    public String toString()
    {
        String str = "transactions=";
        return super.toString() + ", " + str + transactions;
    }
}
