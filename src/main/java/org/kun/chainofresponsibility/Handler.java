package org.kun.chainofresponsibility;

public abstract class Handler {
	private Handler nextHandler;
	private int level;

	public Handler(int level) {
		this.level = level;
	}

	// �������󴫵ݣ�ע��final�����಻����д
	public final void handleMessage(Demand demand) {
		if (level == demand.demandLevel()) {
			this.report(demand);
		} else {
			if (this.nextHandler != null) {
				System.out.println("����̫���أ��豨����һ��");
				this.nextHandler.handleMessage(demand);
			} else {
				System.out.println("�Ҿ���boss��û����ͷ");
			}
		}
	}

	public void setNextHandler(Handler handler) {
		this.nextHandler = handler;
	}

	// ���󷽷�������ʵ��
	public abstract void report(Demand demand);
}
