package org.kun.chainofresponsibility;

public class Boss extends Handler {
	public Boss() {
		super(2);
	}

	@Override
	public void report(Demand demand) {
		System.out.println("����" + demand.detail());
		System.out.println(getClass().getSimpleName() + "�����Ǵ�һ�ܰɣ���Ӯ��������");
	}
}