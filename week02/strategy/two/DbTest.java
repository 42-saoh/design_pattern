package strategy.two;

import strategy.two.userinfo.web.UserInfoClient;
import strategy.two.domain.userinfo.UserInfo;

import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;

public class DbTest {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            Reader reader = new FileReader("week02/strategy/two/db.properties");
            properties.load(reader);
            String dbType = properties.getProperty("DBTYPE");

            UserInfo userInfo = new UserInfo();
            userInfo.setUserId(properties.getProperty("USERID"));
            userInfo.setPasswd(properties.getProperty("PASSWORD"));
            userInfo.setUserName(properties.getProperty("USERNAME"));

            UserInfoClient userInfoClient = new UserInfoClient(userInfo, dbType);

            userInfoClient.insert();
            userInfoClient.update();
            userInfoClient.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
