package org.kun.design_pattern.chainofresponsibility;

public class Client {
	public static void main(String[] args) {
		Demand demandA = new Demand(1); // 请求等级低
		Demand demandB = new Demand(2); // 请求等级高

		Boss boss = new Boss();
		TechnicalManager technicalManager = new TechnicalManager();
		technicalManager.setNextHandler(boss); // 设置下一级

		technicalManager.handleMessage(demandA);
		System.out.println("============================");
		technicalManager.handleMessage(demandB);
	}
}