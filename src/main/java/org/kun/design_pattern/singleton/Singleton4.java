package org.kun.design_pattern.singleton;

/**
 * 静态内部类模式
 * 
 * 优点：将懒加载和线程安全完美结合的一种方式（无锁）。（推荐）
 * 
 * @author kun
 *
 */

public class Singleton4
{
    
    private static class Inner
    {
        // 静态初始化器，由JVM来保证线程安全
        private static Singleton4 instance = new Singleton4();
    }
    
    public static Singleton4 getInstance()
    {
        return Inner.instance;
    }
}
