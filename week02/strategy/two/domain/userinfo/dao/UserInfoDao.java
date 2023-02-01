package strategy.two.domain.userinfo.dao;

import strategy.two.domain.userinfo.UserInfo;

public interface UserInfoDao {
    UserInfo userinfo = null;
    void insertUserInfo();
    void updateUserInfo();
    void deleteUserInfo();
}
