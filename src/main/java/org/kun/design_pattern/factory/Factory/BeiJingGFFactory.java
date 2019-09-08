package org.kun.design_pattern.factory.Factory;

public class BeiJingGFFactory implements IGFFactory {

    @Override
    public IGirlFriend createGirlFriend() {
        return new BeiJingGF();
    }

}
