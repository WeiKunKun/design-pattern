package org.kun.design_pattern.factory.AbstractFactory;

public class SiChuanGFFactory implements IGFFactory
{
    @Override
    public IGirlFriend createGirlFriend()
    {
        return new SichuanGF();
    }
    
    @Override
    public IGFFather createGFFather()
    {
        return new SiChuanGFFather();
    }
    
}
