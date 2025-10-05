public class SavingsAccount extends BankAccount
{
    private double interestRate;
    /**
     *  Uses the first specified double to set the initial balance of the SavingsAccount
     *  and the second specified double to set the interest rate of the SavingsAccount.
     * @param balance
     * @param interestRate
     */
    public SavingsAccount(double balance, double interestRate)
    {
        super(balance);
        this.interestRate = interestRate;
    }
    /**
     * Adds an amount of money to the SavingsAccount equal to the balance
     * of the SavingsAccount times the interest rate of the SavingsAccount.
     */
    public void addInterest()
    {
        super.deposit(interestRate * super.getBalance());
    }
    public String toString()
    {
        return super.toString() + ", " + "interestRate=" + interestRate;
    }
}
