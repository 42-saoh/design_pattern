package strategy.two.domain.userinfo.dao.mysql;

import strategy.two.domain.userinfo.UserInfo;
import strategy.two.domain.userinfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao {
        UserInfo userinfo;

        public UserInfoMysqlDao(UserInfo userinfo) {
                this.userinfo = userinfo;
        }

        @Override
        public void insertUserInfo() {
            System.out.println("Insert into Mysql DB userID = " + userinfo.getUserId());
        }

        @Override
        public void updateUserInfo() {
            System.out.println("Update into Mysql DB userID = " + userinfo.getUserId());
        }

        @Override
        public void deleteUserInfo() {
            System.out.println("Delete from Mysql DB userID = " + userinfo.getUserId());
        }

}
