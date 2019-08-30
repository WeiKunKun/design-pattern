package org.kun.design_pattern.singleton;

/**
 * ��̬�ڲ���ģʽ
 * 
 * �ŵ㣺�������غ��̰߳�ȫ������ϵ�һ�ַ�ʽ�������������Ƽ���
 * 
 * @author kun
 *
 */

public class Singleton4
{
    
    private static class Inner
    {
        // ��̬��ʼ��������JVM����֤�̰߳�ȫ
        private static Singleton4 instance = new Singleton4();
    }
    
    public static Singleton4 getInstance()
    {
        return Inner.instance;
    }
}
