package com.kssasarma.costcalculators;

public class ExpressShipping implements CostCalculator {

	private CostCalculator next;

	public ExpressShipping(CostCalculator next) {
		this.next = next;
	}

	@Override
	public int calculateCost() {
		return 25 + next.calculateCost();
	}

}
