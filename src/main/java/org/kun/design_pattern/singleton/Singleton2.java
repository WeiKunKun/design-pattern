package org.kun.design_pattern.singleton;

/**
 * 懒汉模式
 * 
 * 优点：懒加载启动快，资源占用小，使用时才实例化。
 * 
 * 缺点：synchronized 为独占排他锁，并发性能差。即使在创建成功以后，获取实例仍然是串行化操作。
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
