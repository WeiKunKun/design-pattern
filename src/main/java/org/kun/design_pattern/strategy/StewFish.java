package org.kun.design_pattern.strategy;

/**
 * @author kun
 * @date 2019/09/14
 */
public class StewFish implements ICookFish {

    /* (non-Javadoc)
     * @see org.kun.design_pattern.strategy.ICookFish#cooking()
     */
    @Override
    public void cooking() {
        System.out.println("You can stew fish");
    }

}
