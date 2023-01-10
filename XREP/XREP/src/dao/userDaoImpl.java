package dao;

import bean.Products;
import bean.Users;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.util.HibernateSessionFactory;

import javax.swing.*;
import java.util.List;

public class userDaoImpl  implements userDao {
    private Transaction transaction;
    private Session session;
    private Query query;

    //添加用户
    @Override
    public boolean addUsers(Users users) {
        try{
            session= HibernateSessionFactory.getSession();
            transaction=session.beginTransaction();
            session.save(users);
            transaction.commit();
            session.close();
            return true;
        }catch(Exception e){
            message("saveUsers.error:"+e);
            e.printStackTrace();
            return false;
        }
    }
    //删除用户
    @Override
    public boolean deleteUsers(int account) {
        try{
            session=HibernateSessionFactory.getSession();
            transaction=session.beginTransaction();
            Users users=new Users();
            users=(Users) session.get(Users.class, account);
            session.delete(users);
            transaction.commit();
            session.close();
            return true;
        }catch(Exception e){
            message("deleteUsers.error:"+e);
            e.printStackTrace();
            return false;
        }
    }
    //修改用户
    @Override
    public boolean updateUsers(Users users) {
        try{
            session=HibernateSessionFactory.getSession();
            transaction=session.beginTransaction();
            session.update(users);
            transaction.commit();
            session.close();
            return true;
        }catch(Exception e){
            message("updateUsers.error:"+e);
            e.printStackTrace();
            return false;
        }
    }
    //查找所有用户
    @Override
    public List findAllUsers() {
        session=HibernateSessionFactory.getSession();
        try{
            transaction=session.beginTransaction();
            String queryString="from Users ";
            query=session.createQuery(queryString);
            List list=query.list();
            transaction.commit();
            session.close();
            return list;
        }catch(Exception e){
            message("findUsers.error:"+e);
            e.printStackTrace();
            return null;
        }
    }
    //按照账号查找用户
    @Override
    public Users accountFindUsers(int account, String password) {
        session=HibernateSessionFactory.getSession();
        try{
            transaction=session.beginTransaction();
            Query query = session.createQuery("from Users where account=?1 and password=?2");
            query.setParameter(1, account);
            query.setParameter(2, password);
            Users list= (Users) query.uniqueResult();
            transaction.commit();
            session.close();
            return list;
        }catch(Exception e){
            message("findInfo.error:"+e);
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Users accountFindUser(int account) {
        session=HibernateSessionFactory.getSession();
        try{
            transaction=session.beginTransaction();
            Query query = session.createQuery("from Users where account=?1");
            query.setParameter(1, account);
            Users list= (Users) query.uniqueResult();
            transaction.commit();
            session.close();
            return list;
        }catch(Exception e){
            message("findInfo.error:"+e);
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Users findUser(String nickname, String password) {
        session=HibernateSessionFactory.getSession();
        try{
            transaction=session.beginTransaction();
            Query query = session.createQuery("from Users where nickname=?1 and password=?2");
            query.setParameter(1, nickname);
            query.setParameter(2, password);
            Users list= (Users) query.uniqueResult();
            transaction.commit();
            session.close();
            return list;
        }catch(Exception e){
            message("findInfo.error:"+e);
            e.printStackTrace();
            return null;
        }
    }

    public void message(String mess){
        int type= JOptionPane.YES_NO_OPTION;
        String title="提示信息";
        JOptionPane.showMessageDialog(null, mess, title, type);
    }
}
