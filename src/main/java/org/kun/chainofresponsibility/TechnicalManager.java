package org.kun.chainofresponsibility;

public class TechnicalManager extends Handler {
	public TechnicalManager() {
		super(1);
	}

	@Override
	public void report(Demand demand) {
		System.out.println("����" + demand.detail());
		System.out.println(getClass().getSimpleName() + "��СԳ��ͦ�㣬������󲻸�");
	}
}
