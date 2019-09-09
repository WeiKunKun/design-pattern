package org.kun.design_pattern.observer;

/**
 * @author kun
 * @date 2019/09/09
 */
public class ObserverTest {

    public static void main(String[] args) {
        IUser zhangSan = new CommonUser("Zhang San");
        IUser liSiIUser = new CommonUser("Li Si");
        IUser wangZong = new VipUser("Wang Zong");

        IWeChat dailyEngilish = new OfficialAccount("Daily English");

        dailyEngilish.registerUser(liSiIUser);
        dailyEngilish.registerUser(wangZong);
        dailyEngilish.registerUser(zhangSan);

        dailyEngilish.publishArticle("<<I have a dream>>");

        System.out.println("--------------------------------");
        dailyEngilish.unregisterUser(liSiIUser);
        dailyEngilish.publishArticle("<<Snow White>>");
    }

}
