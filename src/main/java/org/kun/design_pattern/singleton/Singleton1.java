package org.kun.design_pattern.singleton;

/**
 * 饿汉模式
 * 
 * 优点：饿汉模式天生是线程安全的，使用时没有延迟。
 * 
 * 缺点：启动时即创建实例，启动慢，有可能造成资源浪费。
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
