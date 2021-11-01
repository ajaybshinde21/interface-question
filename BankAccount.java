
public class BankAccount {
	private long creditCardNumber;
	private String userName;
	private double balance;

	public BankAccount(long creditCardNumber, String userName, double balance) {
		this.creditCardNumber = creditCardNumber;
		this.userName = userName;
		this.balance = balance;
	}
	public long getCreditCardNumber() {
		return this.creditCardNumber;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void display() {
		char ch = '\u20B9';
		System.out.println(
				this.userName + " " + "with credit card details " + this.creditCardNumber + " has balance "+ch +" "+ this.balance);
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
