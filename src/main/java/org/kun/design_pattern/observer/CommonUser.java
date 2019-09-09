package org.kun.design_pattern.observer;

/**
 * @author kun
 * @date 2019/09/09
 */
public class CommonUser implements IUser {

    private String userName;

    public CommonUser(String userName) {
        this.userName = userName;
    }

    /* (non-Javadoc)
     * @see org.kun.design_pattern.observer.Subscriber#subscribeMessage(java.lang.String)
     */
    @Override
    public void subscribeArticle(String message) {
        System.out.println(userName + " subscribe " + message);
    }

}
