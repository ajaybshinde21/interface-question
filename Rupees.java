public class Rupees extends BankAccount implements CreditCard {

  Rupees(long creditCardNumber, String creditCardHolderName, double balance) {
    super(creditCardNumber, creditCardHolderName, balance);
  }

  @Override
  public void payment(double amount) {
    super.setBalance(super.getBalance() - amount);
  }
}
