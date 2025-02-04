/*Question:
Design an Online Payment System with an abstract class PaymentMethod containing an abstract method processPayment(). Create two derived classes: CreditCard and PayPal,each implementing
the processPayment() method differently (for example, one might charge a fee, and the other might not). Create a method processTransaction(PaymentMethod paymentMethod) that accepts a
PaymentMethod object and processes the payment by calling processPayment(). Demonstrate polymorphism by using both CreditCard and PayPal objects in the transaction processing system.*/

abstract class PaymentMethod
{
	public abstract void processPayment();
}

class CreditCard extends PaymentMethod
{
	public void processPayment()
	{
		System.out.println("Processing payment of Credit Card. Addn fees applied");
	}
}

class PayPal extends PaymentMethod
{
	public void processPayment()
	{
		System.out.println("Process payment of PayPal. No additional fees applied");
	}
}

public class OnlinePaymentSystem
{
	public static void processTransaction(PaymentMethod obj)
	{
		obj.processPayment();
	}

	public static void main(String[] args)
	{
		processTransaction(new CreditCard());
		processTransaction(new PayPal());
	}
}