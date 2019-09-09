package org.kun.design_pattern.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * @author kun
 * @date 2019/09/09
 */
public class OfficialAccount implements IWeChat {

    private String accountName;
    private List<IUser> registeredUsers = new LinkedList<>();

    public OfficialAccount(String accountName) {
        super();
        this.accountName = accountName;
    }

    /* (non-Javadoc)
     * @see org.kun.design_pattern.observer.IWeChat#registerUser(org.kun.design_pattern.observer.IUser)
     */
    @Override
    public void registerUser(IUser user) {
        registeredUsers.add(user);
    }

    /* (non-Javadoc)
     * @see org.kun.design_pattern.observer.IWeChat#unregisterUser(org.kun.design_pattern.observer.IUser)
     */
    @Override
    public void unregisterUser(IUser user) {
        registeredUsers.remove(user);
    }

    void notifyAllUsers(String article) {
        for (IUser user : registeredUsers) {
            user.subscribeArticle(" " + accountName + " " + article);
        }
    }

    /* (non-Javadoc)
     * @see org.kun.design_pattern.observer.IWeChat#publishArticle(java.lang.String)
     */
    @Override
    public void publishArticle(String article) {
        notifyAllUsers(article);
    }

}
