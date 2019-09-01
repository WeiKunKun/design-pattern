package org.kun.design_pattern.factory.Factory;

public class YunNanGFFactory implements IGFFactory
{
    
    @Override
    public IGirlFriend createGirlFriend()
    {
        return new YunNanGF();
    }
    
}
