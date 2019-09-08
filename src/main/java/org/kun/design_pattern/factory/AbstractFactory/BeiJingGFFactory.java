package org.kun.design_pattern.factory.AbstractFactory;

public class BeiJingGFFactory implements IGFFactory {

    @Override
    public IGirlFriend createGirlFriend() {
        return new BeiJingGF();
    }

    @Override
    public IGFFather createGFFather() {

        return new BeiJingGFFather();
    }

}
