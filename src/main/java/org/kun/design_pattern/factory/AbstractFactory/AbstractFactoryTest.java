package org.kun.design_pattern.factory.AbstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        IGFFactory gfFactory = new SiChuanGFFactory();
        IGirlFriend siChuanGirlFriend = gfFactory.createGirlFriend();
        IGFFather siChuanGFather = gfFactory.createGFFather();
        siChuanGFather.sugeestion();
        siChuanGirlFriend.eat();
    }
}
