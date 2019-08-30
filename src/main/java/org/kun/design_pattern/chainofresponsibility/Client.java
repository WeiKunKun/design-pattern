package org.kun.design_pattern.chainofresponsibility;

public class Client {
	public static void main(String[] args) {
		Demand demandA = new Demand(1); // ����ȼ���
		Demand demandB = new Demand(2); // ����ȼ���

		Boss boss = new Boss();
		TechnicalManager technicalManager = new TechnicalManager();
		technicalManager.setNextHandler(boss); // ������һ��

		technicalManager.handleMessage(demandA);
		System.out.println("============================");
		technicalManager.handleMessage(demandB);
	}
}