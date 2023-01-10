package control;

import bean.News;
import com.opensymphony.xwork2.ActionSupport;
import dao.newsDao;
import dao.newsDaoImpl;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class NewsAction extends ActionSupport {
    private  int nid;
    private  String title;
    private  String ncontent;

    private List<News> news;
    private HttpServletRequest request= ServletActionContext.getRequest();

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

    //添加新闻
    public String execute1() throws Exception {
        request=ServletActionContext.getRequest();
        request.setCharacterEncoding("utf-8");
        newsDao addNewsdao=new newsDaoImpl();
        News news=new News();
        news.setTitle((String) request.getParameter("title"));
        news.setNcontent((String) request.getParameter("ncontent"));
        boolean add=addNewsdao.addNews(news);
        if(add){
            execute4();
            return SUCCESS;
        }
        else return ERROR;
    }

    //修改新闻
    public String execute2() throws Exception{
        request=ServletActionContext.getRequest();
        newsDao updatedao=new newsDaoImpl();
        News updateNews=new News();
        int nid= Integer.parseInt(request.getParameter("nid"));
        String title=request.getParameter("title");
        String ncontent=request.getParameter("ncontent");
        updateNews.setNid(nid);
        updateNews.setTitle(title);
        updateNews.setNcontent(ncontent);
        boolean update=updatedao.updateNew(updateNews);
        if(update){
            execute4();
            return SUCCESS;
        }
        else return ERROR;
    }

    //删除新闻
    public String exectue3() throws Exception{
        newsDao delNewsdao=new newsDaoImpl();
        nid= Integer.valueOf(request.getParameter("allNewsID"));
        boolean delete=delNewsdao.deleteNews(nid);
        if(delete) {
            execute4();
            return SUCCESS;
        }
        else return ERROR;
    }


    //按id查找新闻
    public String execute7() throws Exception {
        request = ServletActionContext.getRequest();
        newsDao selectNewsDao = new newsDaoImpl();
        nid= Integer.valueOf(request.getParameter("allNewsID"));
        News list= (News) selectNewsDao.idFindNews(nid);
        request.getSession().setAttribute("selectNews",list);
        return SUCCESS;
    }

    //查询所有新闻
    public String execute4() throws Exception {
        request = ServletActionContext.getRequest();
        newsDao selectNewsDao = new newsDaoImpl();
        List list = selectNewsDao.findAllNews();
        request.getSession().setAttribute("count", list.size());
        request.getSession().setAttribute("selectNews", list);
        return SUCCESS;
    }

    //查询所有新闻id
    public String execute5() throws Exception {
        request = ServletActionContext.getRequest();
        newsDao idFindDao = new newsDaoImpl();
        List list = idFindDao.findAllNews();
        request.getSession().setAttribute("allNewsID", list);
        return SUCCESS;
    }

}
