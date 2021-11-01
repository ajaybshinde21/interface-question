import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Pounds p = new Pounds(123412341234L, "John Doe", 30000);
    p.display();

    System.out.print("How much do you want to pay (in pounds):");
    Scanner input = new Scanner(System.in);
    double paymentAmount = input.nextDouble();

    p.payment(paymentAmount);
    System.out.println("After Paying " + paymentAmount + " pounds");
    p.display();

    System.out.println(
      "------------------------------------------------------"
    );

    Rupees r = new Rupees(111122223333L, "Jane Doe", 40000);
    r.display();
    System.out.print("How much do you want to pay (in rupees):");
    paymentAmount = input.nextDouble();
    r.payment(paymentAmount);
    System.out.println("After Paying " + paymentAmount + " rupees");
    r.display();

    System.out.println(
      "------------------------------------------------------"
    );

    Dollars d = new Dollars(444455556666L, "John Smith", 50000);
    d.display();

    System.out.print("How much do you want to pay (in dollars):");
    paymentAmount = input.nextDouble();
    d.payment(paymentAmount);
    System.out.println("After Paying " + paymentAmount + " dollars");

    d.display();
  }
}
