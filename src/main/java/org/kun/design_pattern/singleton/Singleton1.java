package org.kun.design_pattern.singleton;

/**
 * ����ģʽ
 * 
 * �ŵ㣺����ģʽ�������̰߳�ȫ�ģ�ʹ��ʱû���ӳ١�
 * 
 * ȱ�㣺����ʱ������ʵ�������������п��������Դ�˷ѡ�
 * 
 * @author kun
 *
 */

public class Singleton1
{
    private static Singleton1 instance = new Singleton1();
    
    private Singleton1()
    {
    }
    
    public static Singleton1 getInstance()
    {
        return instance;
    }
    
    public static void main(String[] args)
    {
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        
        System.out.print(instance1 == instance2);
    }
}
