public class Pounds extends BankAccount implements CreditCard {

  Pounds(long creditCardNumber, String creditCardHolderName, double balance) {
    super(creditCardNumber, creditCardHolderName, balance);
  }

  @Override
  public void payment(double amount) {
    super.setBalance(super.getBalance() - changeToRupees(amount));
  }

  public double changeToRupees(double amount) {
    final double exchangeRate = 102.31;
    return amount * exchangeRate;
  }
}
