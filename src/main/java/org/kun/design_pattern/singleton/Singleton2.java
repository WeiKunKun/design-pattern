package org.kun.design_pattern.singleton;

/**
 * ����ģʽ
 * 
 * �ŵ㣺�����������죬��Դռ��С��ʹ��ʱ��ʵ������
 * 
 * ȱ�㣺synchronized Ϊ��ռ���������������ܲ��ʹ�ڴ����ɹ��Ժ󣬻�ȡʵ����Ȼ�Ǵ��л�������
 * 
 * @author kun
 *
 */

public class Singleton2 {
    private static Singleton2 instance = null;

    private Singleton2() {}

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
