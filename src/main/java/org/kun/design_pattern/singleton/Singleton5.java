package org.kun.design_pattern.singleton;

/**
 * ö�ٷ�ʽ
 * 
 * �̰߳�ȫ������Ч�ʸߣ�������ʱ���أ�������Ȼ�ķ�ֹ����ͷ����л�����
 * 
 * @author kun
 *
 */

public enum Singleton5 {
    // ö��Ԫ�ر�����ǵ���
    INSTANCE;

    // ����Լ���Ҫ�Ĳ���
    public void singletonOperation() {
        System.out.println("singleton operation");
    }
}
