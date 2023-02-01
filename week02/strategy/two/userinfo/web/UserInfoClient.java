package strategy.two.userinfo.web;

import strategy.two.domain.userinfo.dao.UserInfoDao;
import strategy.two.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import strategy.two.domain.userinfo.dao.oracle.UserInfoOracleDao;
import strategy.two.domain.userinfo.UserInfo;

public class UserInfoClient {
    UserInfoDao userInfoDao;

    public UserInfoClient(UserInfo userInfo, String dbType) {
        switch (dbType) {
            case "ORACLE" -> userInfoDao = new UserInfoOracleDao(userInfo);
            case "MYSQL" -> userInfoDao = new UserInfoMysqlDao(userInfo);
            default -> {}
        }
    }

    public void insert() {
        userInfoDao.insertUserInfo();
    }

    public void update() {
        userInfoDao.updateUserInfo();
    }

    public void delete() {
        userInfoDao.deleteUserInfo();
    }
}
