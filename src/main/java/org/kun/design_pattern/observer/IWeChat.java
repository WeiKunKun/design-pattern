package org.kun.design_pattern.observer;

/**
 * @author kun
 * @date 2019/09/09
 */
public interface IWeChat {
    /**
     * Register user who subscribe this WeChat
     * 
     * @param user
     *            the user to be registered
     */
    void registerUser(IUser user);

    /**
     * Unregister user who unfollow this WeChat
     * 
     * @param user
     *            the user to be unregistered
     */
    void unregisterUser(IUser user);

    /**
     * Publish article
     * 
     * @param article
     *            the article to publish
     */
    void publishArticle(String article);

}
