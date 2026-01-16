package com.kssasarma.costcalculators;

import com.kssasarma.models.Order;

public class BaseCost implements CostCalculator {
	
	private Order order;

	public BaseCost(Order order) {
		this.order = order;
		
	}
	
	public int calculateCost() {
		return order.calculateTotal();
	}

}
