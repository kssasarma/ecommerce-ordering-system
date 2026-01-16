package com.kssasarma;

import com.kssasarma.costcalculators.BaseCost;
import com.kssasarma.costcalculators.CostCalculator;
import com.kssasarma.costcalculators.ExpressShipping;
import com.kssasarma.costcalculators.GiftWrapping;
import com.kssasarma.models.Order;
import com.kssasarma.models.Product;
import com.kssasarma.models.User;
import com.kssasarma.payments.PayPalPaymentStrategy;

public class Main {
	public static void main(String[] args) {
		// --- 1. Setup Order ---
		System.out.println(">>> 1. Creating Order...");
		User user = new User();
		Order order = new Order(user);

		order.addProduct(new Product("Gaming Laptop", 1000));
		order.addProduct(new Product("Mechanical Mouse", 50));

		// --- 2. Create Cost Logic (The Decorator Chain) ---
		// Logic: Base ($1050) + GiftWrap ($10) + Express ($25) = Total $1085
		System.out.println(">>> 2. Building Cost Decorators...");

		CostCalculator calculator = new ExpressShipping( // Wraps GiftWrapping
				new GiftWrapping( // Wraps BaseCost
						new BaseCost(order) // Base Implementation
				));

		// --- 3. Process Payment ---
		System.out.println(">>> 3. Processing Payment...");
		// This should print: "Paid 1085 using PayPal."
		order.pay(new PayPalPaymentStrategy(), calculator);

		// --- 4. Fulfillment Flow ---
		System.out.println(">>> 4. Shipping Order...");
		order.ship();

		System.out.println(">>> 5. Delivering Order...");
		order.deliver();
	}
}