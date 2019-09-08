package org.kun.design_pattern.singleton;

/**
 * ˫�ؼ������ģʽ�� �ŵ㣺�����أ��̰߳�ȫ��
 * 
 * ע��ʵ�������� volatile �ؼ������Σ��䱣֤��ʼ����ȫ��
 * 
 * ����JVM�ײ�ģ��ԭ��ż��������⣬������ʹ��
 * 
 * @author kun
 *
 */

public class Singleton3 {
    private static volatile Singleton3 instance = null;

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
