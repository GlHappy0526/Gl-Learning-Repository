package dao;


import bean.News;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.util.HibernateSessionFactory;

import javax.swing.*;
import java.util.List;

public class newsDaoImpl implements newsDao {

    private Transaction transaction;
    private Session session;
    private Query query;

    //添加新闻
    @Override
    public boolean addNews(News news) {
        try{
            session= HibernateSessionFactory.getSession();
            transaction=session.beginTransaction();
            session.save(news);
            transaction.commit();
            session.close();
            return true;
        }catch(Exception e){
            message("saveNews.error:"+e);
            e.printStackTrace();
            return false;
        }
    }

    //删除新闻
    @Override
    public boolean deleteNews(int nid) {
        try{
            session=HibernateSessionFactory.getSession();
            transaction=session.beginTransaction();
            News news=new News();
            news=(News) session.get(News.class, nid);
            session.delete(news);
            transaction.commit();
            session.close();
            return true;
        }catch(Exception e){
            message("deleteNews.error:"+e);
            e.printStackTrace();
            return false;
        }
    }

    //修改新闻
    @Override
    public boolean updateNew(News news) {
        try{
            session=HibernateSessionFactory.getSession();
            transaction=session.beginTransaction();
            session.update(news);
            transaction.commit();
            session.close();
            return true;
        }catch(Exception e){
            message("updateMessages.error:"+e);
            e.printStackTrace();
            return false;
        }
    }

    //查找所有新闻
    @Override
    public List findAllNews() {
        session=HibernateSessionFactory.getSession();
        try{
            transaction=session.beginTransaction();
            String queryString="from News ";
            query=session.createQuery(queryString);
            List list=query.list();
            transaction.commit();
            session.close();
            return list;
        }catch(Exception e){
            message("findNews.error:"+e);
            e.printStackTrace();
            return null;
        }
    }

    //按照新闻id查找新闻
    @Override
    public News idFindNews(int nid) {
        session=HibernateSessionFactory.getSession();
        try{
            transaction=session.beginTransaction();
            Query query = session.createQuery("from News where nid=?1");
            query.setParameter(1, nid);
            News list= (News) query.uniqueResult();
            transaction.commit();
            session.close();
            return list;
        }catch(Exception e){
            message("findInfo.error:"+e);
            e.printStackTrace();
            return null;
        }
    }
    //查找新闻
    @Override
    public List findNews(int nid, String title, String ncontent) {
        session=HibernateSessionFactory.getSession();
        try{
            transaction=session.beginTransaction();
            String queryString="from News where nid=? or title=? or ncontent=? ";
            query.setParameter(0, nid);
            query.setParameter(1, title);
            query.setParameter(2, ncontent);
            query=session.createQuery(queryString);
            List list=query.list();
            transaction.commit();
            session.close();
            return list;
        }catch(Exception e){
            message("findNews.error:"+e);
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
