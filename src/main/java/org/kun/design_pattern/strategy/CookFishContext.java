package org.kun.design_pattern.strategy;

/**
 * @author kun
 * @date 2019/09/14
 */
public class CookFishContext {

    ICookFish cookFish;

    public CookFishContext(ICookFish cookFish) {
        this.cookFish = cookFish;
    }

    public void cooking() {
        this.cookFish.cooking();
    }
}
