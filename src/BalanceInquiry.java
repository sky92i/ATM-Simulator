// BalanceInquiry.java
// Represents a balance inquiry ATM transaction

public class BalanceInquiry extends Transaction
{
    // BalanceInquiry constructor
    public BalanceInquiry( int userAccountNumber, Screen atmScreen, 
        BankDatabase atmBankDatabase )
    {
        super( userAccountNumber, atmScreen, atmBankDatabase );
    } // end BalanceInquiry constructor

    // performs the transaction
    public void execute(double a, int b)
    {
        // get references to bank database and screen
        BankDatabase bankDatabase = getBankDatabase();
        Screen screen = getScreen();

        // get the available balance for the account involved
        double availableBalance = bankDatabase.getAvailableBalance(getAccountNumber());

        // get the total balance for the account involved
        double totalBalance = bankDatabase.getTotalBalance(getAccountNumber());

        // display the balance information on the screen
        screen.displayMessageLine( "Balance Information:" );
        screen.displayMessage( " - Available balance:    " ); 
        screen.displayDollarAmount( availableBalance );
        screen.displayMessage( "\n - Total balance:    " );
        screen.displayDollarAmount( totalBalance );
        if (bankDatabase.overdrawnAvailability(getAccountNumber())){
            screen.displayMessage("\n - Overdrawn limit:    ");
            screen.displayDollarAmount(bankDatabase.getOverdrawnLimit(getAccountNumber()));
            screen.displayMessageLine( "\n\t                             Back<<" );
        }
        else
            screen.displayMessageLine( "\n\n\t                             Back<<" );
    } // end method execute
} // end class BalanceInquiry