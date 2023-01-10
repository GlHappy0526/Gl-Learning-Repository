package bean;

import java.io.Serializable;

public class Products implements Serializable {
    private  final long serialVersionUID=1L;
    private  int pid;
    private  String pname;
    private  String introduction;

    public Products(){}

    private Products(int pid,String pname,String introduction){
        this.pid=pid;
        this.pname=pname;
        this.introduction=introduction;
    }

    public  int getPid() {
        return pid;
    }
    public  void setPid(int pid) {
        this.pid = pid;
    }

    public  String getPname() {
        return pname;
    }
    public  void setPname(String pname) {
        this.pname = pname;
    }

    public  String getIntroduction() {
        return introduction;
    }
    public  void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
