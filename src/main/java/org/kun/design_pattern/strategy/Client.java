package org.kun.design_pattern.strategy;

/**
 * @author kun
 * @date 2019/09/14
 */
public class Client {

    public static void main(String[] args) {
        ICookFish steamFish = new SteamFish();
        CookFishContext context = new CookFishContext(steamFish);
        context.cooking();
    }

}
