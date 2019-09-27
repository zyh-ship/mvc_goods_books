package cn.itcast.goods.category.domain;

/*
FieldTypeComment
uidchar(32) NOT NULL
loginnamevarchar(50) NULL
loginpassvarchar(50) NULL
emailvarchar(50) NULL
statustinyint(1) NULL
activationCodechar(64) NULL

*/
public class User {
    private String verifycode;
    private String reloginpass;
    private String newpass;
    private String uid;
    private String loginname;
    private String loginpass;
    private String email;
    private int status;
    private String activationCode;
    @Override
    public String toString() {
        return "User{" +
                "verifycode='" + verifycode + '\'' +
                ", reloginpass='" + reloginpass + '\'' +
                ", newpass='" + newpass + '\'' +
                ", uid='" + uid + '\'' +
                ", loginname='" + loginname + '\'' +
                ", loginpass='" + loginpass + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", activationCode='" + activationCode + '\'' +
                '}';
    }

    public String getReloginpass() {
        return reloginpass;
    }

    public void setReloginpass(String reloginpass) {
        this.reloginpass = reloginpass;
    }

    public String getNewpass() {
        return newpass;
    }

    public void setNewpass(String newpass) {
        this.newpass = newpass;
    }

    public String getVerifycode() {

        return verifycode;
    }

    public void setVerifycode(String verifycode) {
        this.verifycode = verifycode;
    }

    public User(String verifycode, String reloginpass, String newpass, String uid, String loginname, String loginpass, String email, int status, String activationCode) {

        this.verifycode = verifycode;
        this.reloginpass = reloginpass;
        this.newpass = newpass;
        this.uid = uid;
        this.loginname = loginname;
        this.loginpass = loginpass;
        this.email = email;
        this.status = status;
        this.activationCode = activationCode;
    }



    public User() {
        super();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getLoginpass() {
        return loginpass;
    }

    public void setLoginpass(String loginpass) {
        this.loginpass = loginpass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    public User(String uid, String loginname, String loginpass, String email, int status, String activationCode) {

        this.uid = uid;
        this.loginname = loginname;
        this.loginpass = loginpass;
        this.email = email;
        this.status = status;
        this.activationCode = activationCode;
    }
}
