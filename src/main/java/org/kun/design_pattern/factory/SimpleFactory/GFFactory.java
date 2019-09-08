package org.kun.design_pattern.factory.SimpleFactory;

public class GFFactory {
    private static IGirlFriend girlFriend = null;

    public static IGirlFriend createGF(GFType type) {
        if (type == GFType.BEI_JING) {
            girlFriend = new BeiJingGF();
        } else if (type == GFType.SI_CHUAN) {
            girlFriend = new SiChuanGF();
        } else if (type == GFType.YU_NAN) {
            girlFriend = new YunNanGF();
        } else {
            System.out.println("Thre is no type of GF");

        }

        return girlFriend;
    }

}
