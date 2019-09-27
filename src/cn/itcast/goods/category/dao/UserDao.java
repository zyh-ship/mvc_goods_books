package cn.itcast.goods.category.dao;


import cn.itcast.commons.CommonUtils;
import cn.itcast.goods.category.domain.User;
import cn.itcast.jdbc.TxQueryRunner;
import cn.itcast.mail.Mail;
import cn.itcast.mail.MailUtils;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import javax.mail.Session;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.Properties;

public class UserDao {
    TxQueryRunner txQueryRunner = new TxQueryRunner();
    public boolean ajaxFindloginname(String loginname) throws SQLException {
        String sql = "select count(1) from t_user where loginname=?";
        Number number = (Number) txQueryRunner.query(sql,new ScalarHandler(),loginname);
        return number.intValue()==0;
    }
    public boolean ajaxFindEmail(String email) throws SQLException {
        String sql = "select count(1) from t_user where email=?";
        Number number = (Number) txQueryRunner.query(sql,new ScalarHandler(),email);
        return number.intValue()==0;
    }
    public void addUser(User user) throws SQLException {
        String sql = "insert into t_user values(?,?,?,?,?,?)";
        Object[] params = {user.getUid(), user.getLoginname(), user.getLoginpass(), user.getEmail(), user.getStatus(), user.getActivationCode()};
        txQueryRunner.update(sql, params);
    }
    public void regist(User user) throws IOException {
        Properties properties = new Properties();
        properties.load(this.getClass().getClassLoader().getResourceAsStream("email_template.properties"));

        user.setUid(CommonUtils.uuid());
        user.setStatus(0);
        user.setActivationCode(CommonUtils.uuid()+CommonUtils.uuid());
        String host = properties.getProperty("host");
        String nama = properties.getProperty("username");
        String pass = properties.getProperty("password");
        Session session = MailUtils.createSession(host,nama,pass);
        String from = properties.getProperty("from");
        String to = user.getEmail();
        String subject=properties.getProperty("subject");
        String content=MessageFormat.format(properties.getProperty("subjuct"),user.getActivationCode());
        Mail mail= new Mail(from,to,subject,content);
    }
}
