package bean;

import java.io.Serializable;

public class News implements Serializable {
    private  final long serialVersionUID = 1L;
    private  int nid;
    private  String title;
    private  String ncontent;

    public News() {
    }

    private News(int nid, String title, String ncontent) {
        this.nid = nid;
        this.title = title;
        this.ncontent = ncontent;
    }

    public  int getNid() {
        return nid;
    }
    public  void setNid(int nid) {
        this.nid = nid;
    }

    public  String getTitle() {
        return title;
    }
    public  void setTitle(String title) {
        this.title = title;
    }

    public  String getNcontent() {
        return ncontent;
    }
    public  void setNcontent(String ncontent) {
        this.ncontent = ncontent;
    }
}
