package org.kun.design_pattern.factory.SimpleFactory;

public class SimpleFactoryTest
{
    
    public static void main(String[] args)
    {
        IGirlFriend yunNanGirlFriend = GFFactory.createGF(GFType.YU_NAN);
        yunNanGirlFriend.eat();
    }
    
}
