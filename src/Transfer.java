public class Transfer extends Transaction {
    // Transfer constructor
    public Transfer( int userAccountNumber, Screen atmScreen,
                       BankDatabase atmBankDatabase, Keypad atmKeypad )
    {
        // initialize superclass variables
        super( userAccountNumber, atmScreen, atmBankDatabase );
    } // end transfer constructor

    public void execute(double amount, int toAccount)
    {
        double availableBalance; // amount available for transfer

        // get references to bank database and screen
        BankDatabase bankDatabase = getBankDatabase();
        Screen screen = getScreen();
        
        // get available balance of account involved
        if(bankDatabase.overdrawnAvailability(getAccountNumber())) {
            if(bankDatabase.getAvailableBalance(getAccountNumber()) <= 0)
                availableBalance = bankDatabase.getOverdrawnLimit(getAccountNumber());
            else
                availableBalance = bankDatabase.getOverdrawnLimit(getAccountNumber()) +
                    bankDatabase.getAvailableBalance(getAccountNumber());
        }
        else
            availableBalance = bankDatabase.getAvailableBalance(getAccountNumber());

        // check whether the user has enough money in the account
        if ( amount <= availableBalance )
        {
            // update the account involved to reflect transfer
            bankDatabase.debit( getAccountNumber(), amount );
            bankDatabase.credit( toAccount, amount );

            screen.displayMessageLine( "Transfer success"
                + "\n\n>>Back\t       Invoice and back<<"
                + "\n\n>>Exit\t         Invoice and exit<<" );
        } // end if
        else // not enough money available in user's account
        {
            screen.displayMessageLine( "Insufficient funds in your account."
                + "\nPlease choose a smaller amount."
                + "\n>>Back\t       Invoice and back<<"
                + "\n\n>>Exit\t         Invoice and exit<<" );
        } // end else
    } // end method execute
}