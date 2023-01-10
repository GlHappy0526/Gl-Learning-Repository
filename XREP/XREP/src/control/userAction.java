package control;

import bean.Users;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.userDao;
import dao.userDaoImpl;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public class userAction extends ActionSupport {
    private int account;
    private String password;
    private String nickname;
    private String sex;
    private String birthday;
    private String hometown;
    private String email;

    private List<Users> users;
    private HttpServletRequest request= ServletActionContext.getRequest();


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

    //管理员登录
     public String execute1() throws Exception {
            userDao adminLoginDao = new userDaoImpl();
            String ac=request.getParameter("account");
            String pw= (String) request.getAttribute("password");
            if (ac=="1"&&pw=="1111"){
                return SUCCESS;
            }else {
                return ERROR;
            }
        }

        //普通用户登录
        public String execute2() throws Exception {
            userDao adminLoginDao = new userDaoImpl();
            int ac=Integer.valueOf(request.getParameter("account"));
            String pw= (String) request.getAttribute("password");
            Users user=adminLoginDao.accountFindUsers(ac,pw);
            if (user != null) {
                request = ServletActionContext.getRequest();
                userDao selectAccount = new userDaoImpl();
                Users list= (Users) selectAccount.accountFindUser(account);
                request.getSession().setAttribute("selectUser",list);
                return SUCCESS;
            } else {
                return ERROR;
            }
        }

        //添加用户
        public String execute3() throws Exception {
            request=ServletActionContext.getRequest();
            request.setCharacterEncoding("utf-8");
            userDao addUserDao=new userDaoImpl();
            Users users=new Users();
            users.setPassword(request.getParameter("password"));
            users.setNickname(request.getParameter("nickname"));
            users.setSex("sex");
            users.setBirthday("birthday");
            users.setHometown("hometown");
            users.setEmail("email");
            boolean addUser=addUserDao.addUsers(users);
            if(addUser){
                execute9();
                return SUCCESS;
            }
            else return ERROR;
        }


    //修改用户
    public String execute5() throws Exception{
        request=ServletActionContext.getRequest();
        userDao updatedao=new userDaoImpl();
        Users updateuser=new Users();
        int account= Integer.parseInt(request.getParameter("account"));
        String password=request.getParameter("password");
        String nickname=request.getParameter("nickname");
        String sex=request.getParameter("sex");
        String birthday=request.getParameter("birthday");
        String hometown=request.getParameter("hometown");
        String email=request.getParameter("email");
        updateuser.setAccount(account);
        updateuser.setPassword(password);
        updateuser.setNickname(nickname);
        updateuser.setSex(sex);
        updateuser.setBirthday(birthday);
        updateuser.setHometown(hometown);
        updateuser.setEmail(email);
        boolean update=updatedao.updateUsers(updateuser);
        if(update){
            execute9();
            return SUCCESS;
        }
        else return ERROR;
    }

    //删除用户
    public String exectue6() throws Exception{
        userDao delUserdao=new userDaoImpl();
        account= Integer.valueOf(request.getParameter("allUsersAccount"));
        boolean delete=delUserdao.deleteUsers(account);
        if(delete) {
            execute9();
            return SUCCESS;
        }
        else return ERROR;
    }


    //按account查找用户信息
    public String execute7() throws Exception {
        request = ServletActionContext.getRequest();
        userDao selectAccount = new userDaoImpl();
        account= Integer.valueOf(request.getParameter("allUsersAccount"));
        Users list= (Users) selectAccount.accountFindUser(account);
        request.getSession().setAttribute("selectUser",list);
        return SUCCESS;
    }

    //查找所用用户账号
    public String execute8() throws Exception {
        request = ServletActionContext.getRequest();
        userDao dao = new userDaoImpl();
        List list = dao.findAllUsers();
        request.getSession().setAttribute("allUsersAccount", list);
        return SUCCESS;
    }

    //查找所有用户
     public String execute9() throws Exception {
         request = ServletActionContext.getRequest();
         userDao selectUsersdao = new userDaoImpl();
         List list = selectUsersdao.findAllUsers();
         request.getSession().setAttribute("Users", list);
         return SUCCESS;
     }

    public String execute10() throws Exception {
        request = ServletActionContext.getRequest();
        userDao selectUsersdao = new userDaoImpl();
        int account= Integer.parseInt(request.getParameter("account"));
        request.getSession().setAttribute("account",account);

        String nickname=request.getParameter("nickname");
        request.getSession().setAttribute("nickname",nickname);

        return SUCCESS;
    }


}
