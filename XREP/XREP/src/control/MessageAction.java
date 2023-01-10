package control;

import bean.Messages;
import com.opensymphony.xwork2.ActionSupport;
import dao.messagesDao;
import dao.messagesDaoImpl;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class MessageAction  extends ActionSupport {
    private static int mid;
    private static int account;
    private static String nickname;
    private static String message;
    private static String messagetime;
    private List<Messages> messages;
    private HttpServletRequest request= ServletActionContext.getRequest();

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

    //添加留言
    public String execute1() throws Exception {
        request=ServletActionContext.getRequest();
        request.setCharacterEncoding("utf-8");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String messagetime=df.format(new Date());
        messagesDao addMessageDao=new messagesDaoImpl();
        Messages message=new Messages();
        message.setAccount(Integer.valueOf(request.getParameter("account")));
        message.setNickname(request.getParameter("nickname"));
        message.setMessage(request.getParameter("message"));
        message.setMessagetime(messagetime);
        boolean add=addMessageDao.addMessages(message);
        if(add){
            execute4();
            return SUCCESS;
        }
        else return ERROR;
    }

    //删除留言
    public String exectue2() throws Exception{
        messagesDao delMessagedao=new messagesDaoImpl();
        mid= Integer.valueOf(request.getParameter("allMessageId"));
        boolean delete=delMessagedao.deleteMessage(mid);
        if(delete) {
            execute4();
            return SUCCESS;
        }
        else return ERROR;
    }

    //修改留言
    //按照id查找留言
    public String execute6() throws Exception{
        request=ServletActionContext.getRequest();
        messagesDao selectId=new messagesDaoImpl();
        mid= Integer.valueOf(request.getParameter("allMessageId"));
        Messages list= (Messages) selectId.idFindmessage(mid);
        request.getSession().setAttribute("selectMessage",list);
        return SUCCESS;
    }

    //修改留言
    public String execute7() throws Exception{
        request=ServletActionContext.getRequest();
        messagesDao updatedao=new messagesDaoImpl();
        Messages updatemessage=new Messages();
        int mid= Integer.parseInt(request.getParameter("mid"));
        String message=request.getParameter("message");
        String nickname=request.getParameter("nickname");
        int account=Integer.parseInt(request.getParameter("account"));
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String messagetime=df.format(new Date());
        updatemessage.setMid(mid);
        updatemessage.setAccount(account);
        updatemessage.setNickname(nickname);
        updatemessage.setMessage(message);
        updatemessage.setMessagetime(messagetime);
        boolean update=updatedao.updateMessages(updatemessage);
        if(update){
            execute4();
            return SUCCESS;
        }
        else return ERROR;
    }

    //查询留言
    public String execute4() throws Exception {
        request = ServletActionContext.getRequest();
        messagesDao selectMessagesDao = new messagesDaoImpl();
        List list = selectMessagesDao.findAllmessage();
        request.getSession().setAttribute("count", list.size());
        request.getSession().setAttribute("selectMessage", list);
        return SUCCESS;
    }

    //查询所有留言id
    public String execute5() throws Exception {
        request = ServletActionContext.getRequest();
        messagesDao dao = new messagesDaoImpl();
        List list = dao.findAllmessage();
        request.getSession().setAttribute("allMessageId", list);
        return SUCCESS;
    }
}
