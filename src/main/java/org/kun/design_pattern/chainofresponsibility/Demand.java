package org.kun.design_pattern.chainofresponsibility;

public class Demand {
	public int level;

	public Demand(int level) {
		this.level = level;
	}

	public int demandLevel() {
		return this.level;
	}

	public String detail() {
		return "detail";
	}
}
