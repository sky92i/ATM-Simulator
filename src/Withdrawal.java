// Withdrawal.java
// Represents a withdrawal ATM transaction

public class Withdrawal extends Transaction
{
    private CashDispenser cashDispenser; // reference to cash dispenser
    //protected double availableBalance;

    // Withdrawal constructor
    public Withdrawal( int userAccountNumber, Screen atmScreen, 
        BankDatabase atmBankDatabase, Keypad atmKeypad, 
        CashDispenser atmCashDispenser )
    {
        // initialize superclass variables
        super( userAccountNumber, atmScreen, atmBankDatabase );

        // initialize references to keypad and cash dispenser
        cashDispenser = atmCashDispenser;
    } // end Withdrawal constructor

    // perform transaction
    public void execute(double amount, int nouse)
    {
        //double availableBalance; // amount available for withdrawal

        // get references to bank database and screen
        BankDatabase bankDatabase = getBankDatabase(); 
        Screen screen = getScreen();

        // update the account involved to reflect withdrawal
        bankDatabase.debit( getAccountNumber(), amount );

        cashDispenser.dispenseCash( amount ); // dispense cash

        screen.displayMessageLine( "Transaction accepted" );
        screen.displayMessageLine( "Do you want a invoice?" );
        screen.displayMessageLine( "\n\n>>Yes\t\t    No<<" );
   } // end method execute
} // end class Withdrawal