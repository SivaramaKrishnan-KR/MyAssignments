package week3.day2;

public interface RBI {
	
	/**
	 * RBI to estimate the minimum balance amount for all the bank details and card details
	 * 
	 * @param balance - minimum balance for all the account types
	 * @param - amount - provides the details of debit card details
	 * @author Sivarama Krishnan R
	 * @exception {@link NoSuchElementException}
	 */
	public void minimumBalance(int balance);
	public void provideDebitCard(boolean amount);

}
