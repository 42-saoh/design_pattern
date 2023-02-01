package strategy.two.domain.userinfo.dao.oracle;

import strategy.two.domain.userinfo.UserInfo;
import strategy.two.domain.userinfo.dao.UserInfoDao;


public class UserInfoOracleDao implements UserInfoDao {
    UserInfo userinfo;
    public UserInfoOracleDao(UserInfo userinfo) {
        this.userinfo = userinfo;
    }

    @Override
    public void insertUserInfo() {
        System.out.println("Insert into Oracle DB userID = " + userinfo.getUserId());
    }

    @Override
    public void updateUserInfo() {
        System.out.println("Update into Oracle DB userID = " + userinfo.getUserId());
    }

    @Override
    public void deleteUserInfo() {
        System.out.println("Delete from Oracle DB userID = " + userinfo.getUserId());
    }

}
