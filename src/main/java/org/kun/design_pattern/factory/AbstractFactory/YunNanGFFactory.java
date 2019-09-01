package org.kun.design_pattern.factory.AbstractFactory;

public class YunNanGFFactory implements IGFFactory
{
    
    @Override
    public IGirlFriend createGirlFriend()
    {
        return new YunNanGF();
    }
    
    @Override
    public IGFFather createGFFather()
    {
        return new YunNanGFFather();
    }
    
}
