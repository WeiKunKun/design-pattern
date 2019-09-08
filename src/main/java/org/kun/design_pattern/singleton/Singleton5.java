package org.kun.design_pattern.singleton;

/**
 * 枚举方式
 * 
 * 线程安全，调用效率高，不能延时加载，可以天然的防止反射和反序列化调用
 * 
 * @author kun
 *
 */

public enum Singleton5 {
    // 枚举元素本身就是单例
    INSTANCE;

    // 添加自己需要的操作
    public void singletonOperation() {
        System.out.println("singleton operation");
    }
}
