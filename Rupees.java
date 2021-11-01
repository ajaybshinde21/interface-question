
public class Rupees extends BankAccount implements CreditCard {
	Rupees(long creditCardNumber, String userName, double balance) {
		super(creditCardNumber, userName, balance);
	}

	@Override
	public void payment(double amount) {
		super.setBalance(super.getBalance() - amount);
	}
}
