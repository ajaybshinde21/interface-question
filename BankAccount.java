public class BankAccount {

  private long creditCardNumber;
  private String creditCardHolderName;
  private double balance;

  public BankAccount(
    long creditCardNumber,
    String creditCardHolderName,
    double balance
  ) {
    this.creditCardNumber = creditCardNumber;
    this.creditCardHolderName = creditCardHolderName;
    this.balance = balance;
  }

  public long getCreditCardNumber() {
    return this.creditCardNumber;
  }

  public String getcreditCardHolderName() {
    return this.creditCardHolderName;
  }

  public double getBalance() {
    return this.balance;
  }

  public void display() {
    char indianRupeesSymbol = '\u20B9';
    System.out.println(
      this.creditCardHolderName +
      " " +
      "with credit card details " +
      this.creditCardNumber +
      " has balance " +
      indianRupeesSymbol +
      " " +
      this.balance
    );
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }
}
