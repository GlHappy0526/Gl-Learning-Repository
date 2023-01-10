package dao;

import bean.Messages;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.util.HibernateSessionFactory;

import javax.swing.*;
import java.util.List;

public class messagesDaoImpl implements  messagesDao{

    private Transaction transaction;
    private Session session;
    private Query query;

    //添加留言
    @Override
    public boolean addMessages(Messages messages) {
        try{
            session= HibernateSessionFactory.getSession();
            transaction=session.beginTransaction();
            session.save(messages);
            transaction.commit();
            session.close();
            return true;
        }catch(Exception e){
            message("saveMessages.error:"+e);
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteMessage(int mid) {
        try{
            session=HibernateSessionFactory.getSession();
            transaction=session.beginTransaction();
            Messages messages=new Messages();
            messages=(Messages) session.get(Messages.class, mid);
            session.delete(messages);
            transaction.commit();
            session.close();
            return true;
        }catch(Exception e){
            message("deleteMessages.error:"+e);
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateMessages(Messages messages) {
        try{
            session=HibernateSessionFactory.getSession();
            transaction=session.beginTransaction();
            session.update(messages);
            transaction.commit();
            session.close();
            return true;
        }catch(Exception e){
            message("updateMessages.error:"+e);
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List findAllmessage() {
        session=HibernateSessionFactory.getSession();
        try{
            transaction=session.beginTransaction();
            String queryString="from Messages ";
            query=session.createQuery(queryString);
            List list=query.list();
            transaction.commit();
            session.close();
            return list;
        }catch(Exception e){
            message("findMessages.error:"+e);
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Messages idFindmessage(int mid) {
        session=HibernateSessionFactory.getSession();
        try{
            transaction=session.beginTransaction();
            Query query = session.createQuery("from Messages where mid=?1");
            query.setParameter(1, mid);
            Messages list= (Messages) query.uniqueResult();
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
    public List findMessages(int account,String nickname, String content, String messagetime) {
        session=HibernateSessionFactory.getSession();
        try{
            transaction=session.beginTransaction();
            String queryString="from Messages where account=? or nickname=? or message=? or messagetime=? ";
            query.setParameter(0, account);
            query.setParameter(1, nickname);
            query.setParameter(2, content);
            query.setParameter(3, messagetime);
            query=session.createQuery(queryString);
            List list=query.list();
            transaction.commit();
            session.close();
            return list;
        }catch(Exception e){
            message("findMessages.error:"+e);
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
