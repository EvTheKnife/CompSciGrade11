


/**
 * This class implements a simple bank account.
 * We will assume a well-behaved user.
 *
 * @author Ms. Martino
 * @version
 */
public class BankAccount {

    private String name;

    private int pin;
    // The bank account balance
    private double balance;

    /**
     * Constructs a bank account with an initial balance of zero dollars.
     */
    public BankAccount() {
        balance = 0;
        name = "genericName";
        pin = 1234;
    }

    /**
     * Constructs a bank account where the user defines the initial balance.
     *
     * @param initialBalance starting balance.
     */
    public BankAccount(double initialBalance, String name, int pin) {
        this.balance = initialBalance;
        this.name = name;
        this.pin = pin;
    }
    /**
     * Return the account balance.
     *
     * @return The account balance.
     */
    public double getBalance() {
        return balance;
    }
    
    public String getName() {
        return name;
    }

    /**
     * Add a specified amount to the account balance.
     *
     * @param amountToDeposit deposit amount
     */
    public void deposit(double deposit, int pin) {
        if (this.pin == pin) {
            this.balance += deposit;
        }
        else {
            System.out.println("WRONG PIN");
        }
    }
    


    /**
     * Remove a specified amount from the account balance.
     *
     * @param amountToWithdraw withdrawal amount
     */
    public void withdraw(double withdraw, int pin) {
        if (this.pin == pin) {
            if (this.balance - withdraw >= 0) {
                    this.balance -= withdraw;
            }
            else {
                System.out.println("You're broke, no widthdraw for you!");
            }
        }
        else {
            System.out.println("WRONG PIN");
        } 
       
    }

    public void setName(String name, int pin) {
        if (this.pin == pin) {
            this.name = name;
        }
        else {
            System.out.println("WRONG PIN");
        }
    }

    public void forgotPin(int pin) {
        if (this.pin == pin) {
            this.pin = pin;
        }
        else {
            System.out.println("Please enter your current pin if you forgot your pin");
        }
    }

    @Override
    public String toString() {
        if (balance <= 0) {
            return name + " is broke";
        }
        else {
            return name + "'s current balance is " + balance;
        }
    }
}
