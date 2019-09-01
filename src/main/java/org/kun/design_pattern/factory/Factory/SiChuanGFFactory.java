package org.kun.design_pattern.factory.Factory;

public class SiChuanGFFactory implements IGFFactory
{
    @Override
    public IGirlFriend createGirlFriend()
    {
        return new SichuanGF();
    }
    
}
