package org.kun.design_pattern.factory.AbstractFactory;

public class FactoryTest {

    public static void main(String[] args) {
        IGirlFriend beiJingGirlFriend = new BeiJingGFFactory().createGirlFriend();
        beiJingGirlFriend.eat();

    }
}
