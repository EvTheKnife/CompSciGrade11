/**
 * Driver for testing BankAccount
 * class methods.
 */
public class Driver {
    public static void main(String[] args) {
        //Test the default constructor/accessor.
        BankAccount kellyAccount = new BankAccount();

        kellyAccount.deposit(10_000, 1234);

        System.out.println(kellyAccount);

        //Test the second constructor/accessor.
        BankAccount chellAccount = new BankAccount(100.00, "Chell", 9535);

        chellAccount.withdraw(100, 2020);

        System.out.println(chellAccount);

        if (chellAccount.getBalance() <= 0) {
            System.out.println("Aint that the truth");
        }

    }
}