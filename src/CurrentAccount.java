public class CurrentAccount extends Account {
    private double defaultOverdrawnLimit = 10000; // current account overdrawn limit
    private double availableOverdrawnBalance = defaultOverdrawnLimit; // available overdrawn balance for the account

    // CurrentAccount constructor initializes attributes
    public CurrentAccount(int theAccountNumber, int thePIN, double theAvailableBalance, double theTotalBalance) {
        super(theAccountNumber, thePIN, theAvailableBalance, theTotalBalance);
        overdrawnAvailable = true;
        if(theAvailableBalance < 0)
            availableOverdrawnBalance += theAvailableBalance;
    }

    // returns overdrawnLimit of the current account
    public double getCurrentAccount() {
        return availableOverdrawnBalance;
    }

    // set overdrawnLimit of the current account
    public void setCurrentAccount(int limit) {
        availableOverdrawnBalance += limit;
    }

    // debit available overdrawn balance of the current account
    public void debit(double amount) {
        if(amount > totalBalance) {
            if (availableOverdrawnBalance <= (amount - availableBalance))
                availableOverdrawnBalance = 0;
            else
                availableOverdrawnBalance -= (amount - availableBalance);
        }
        availableBalance -= amount;
        totalBalance -= amount;
    }
    
    public void credit(double amount) {
        if(totalBalance <= 0)
            availableOverdrawnBalance += amount;
        availableBalance += amount;
        totalBalance += amount;
        if(availableOverdrawnBalance > defaultOverdrawnLimit)
            availableOverdrawnBalance = defaultOverdrawnLimit;
    }
}