package org.kun.design_pattern.singleton;

/**
 * 双重加锁检查模式。 优点：懒加载，线程安全。
 * 
 * 注：实例必须有 volatile 关键字修饰，其保证初始化完全。
 * 
 * 由于JVM底层模型原因，偶尔会出问题，不建议使用
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
