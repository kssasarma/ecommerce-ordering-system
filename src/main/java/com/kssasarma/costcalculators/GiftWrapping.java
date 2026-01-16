package com.kssasarma.costcalculators;

public class GiftWrapping implements CostCalculator {

	private CostCalculator next;

	public GiftWrapping(CostCalculator next) {
		this.next = next;
	}

	@Override
	public int calculateCost() {
		return 10 + next.calculateCost();
	}

}
