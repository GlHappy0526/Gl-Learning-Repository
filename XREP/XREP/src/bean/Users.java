package bean;
import java.io.Serializable;

public class Users implements Serializable {
    private static final long serialVersionUID=1L;
    private int account;
    private String password;
    private String nickname;
    private String sex;
    private String birthday;
    private String hometown;
    private String email;

    public Users(){

    }

    public Users(int account,String password,String nickname,String sex,String birthday,String hometown,String  email){
        this.account=account;
        this.password=password;
        this.nickname=nickname;
        this.sex=sex;
        this.birthday=birthday;
        this.hometown=hometown;
        this.email=email;
    }

    public int getAccount() {
        return account;
    }
    public void setAccount(int account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHometown() {
        return hometown;
    }
    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


}