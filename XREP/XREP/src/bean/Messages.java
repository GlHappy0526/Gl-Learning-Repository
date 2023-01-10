package bean;


public class Messages{

    private  int mid;
    private  int account;
    private  String nickname;
    private  String message;
    private  String messagetime;

    public Messages(){}

    public Messages(int account,String nickname,String message,String messagetime){
        this.account=account;
        this.nickname=nickname;
        this.message=message;
        this.messagetime=messagetime;
    }

    public  int getMid() {
        return mid;
    }

    public  void setMid(int mid) {
        this.mid = mid;
    }

    public  int getAccount() {
        return account;
    }

    public  void setAccount(int account) {
        this.account = account;
    }

    public  String getNickname() {
        return nickname;
    }

    public  void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public  String getMessage() {
        return message;
    }

    public  void setMessage(String message) {
        this.message = message;
    }

    public  String getMessagetime() {
        return messagetime;
    }

    public  void setMessagetime(String messagetime) {
        this.messagetime = messagetime;
    }
}
