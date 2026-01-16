package com.kssasarma.payments;

public class PayPalPaymentStrategy implements PaymentStrategy {

	@Override
	public void pay(int amount) {
		System.out.println("Paid " + amount + " using PayPal.");
	}

}
