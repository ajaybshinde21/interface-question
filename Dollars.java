public class Dollars extends BankAccount implements CreditCard {

  Dollars(long creditCardNumber, String creditCardHolderName, double balance) {
    super(creditCardNumber, creditCardHolderName, balance);
  }

  @Override
  public void payment(double amount) {
    super.setBalance(super.getBalance() - changeToRupees(amount));
  }

  public double changeToRupees(double amount) {
    final double exchangeRate = 74.80;
    return amount * exchangeRate;
  }
}
