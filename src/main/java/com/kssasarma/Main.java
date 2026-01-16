package com.kssasarma;

import com.kssasarma.payments.PayPalPaymentStrategy;

public class Main {
	public static void main(String[] args) {
		User user = new User();
		Order order = new Order(user);
		order.addProduct(new Product("Laptop", 1000));
		order.addProduct(new Product("Mouse", 50));

		// 1. Calculate Cost with Decorators (Wrapper style)
		// Base cost is 1050. Gift wrap adds 10. Total should be 1060.
		CostCalculator calculator = new GiftWrapping(order);

		// 2. Pay using Strategy
		// Should print: "Paid 1060 using PayPal."
		order.pay(new PayPalPaymentStrategy(), calculator);

		order.ship();
	}
}