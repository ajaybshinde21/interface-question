
public class Pounds extends BankAccount implements CreditCard {

	Pounds(long creditCardNumber, String userName, double balance){
		super(creditCardNumber, userName,balance);
	}
	
	@Override
	public void payment(double amount) {
		 super.setBalance(super.getBalance()- changeToRupees(amount));
	}
	public double changeToRupees(double amount) {
		final double exchangeRate = 102.31;
		return amount * exchangeRate;
	}
	
}
