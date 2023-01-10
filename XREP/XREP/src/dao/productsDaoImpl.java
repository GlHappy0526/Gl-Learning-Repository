package dao;


import bean.Messages;
import bean.Products;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.util.HibernateSessionFactory;

import javax.swing.*;
import java.util.List;

public class productsDaoImpl implements productsDao {
    private Transaction transaction;
    private Session session;
    private Query query;

    //添加产品
    @Override
    public boolean addProducts(Products products) {
        try{
            session= HibernateSessionFactory.getSession();
            transaction=session.beginTransaction();
            session.save(products);
            transaction.commit();
            session.close();
            return true;
        }catch(Exception e){
            message("saveProducts.error:"+e);
            e.printStackTrace();
            return false;
        }
    }

    //删除产品
    @Override
    public boolean deleteProducts(int pid) {
        try{
            session=HibernateSessionFactory.getSession();
            transaction=session.beginTransaction();
            Products products=new Products();
            products=(Products) session.get(Products.class, pid);
            session.delete(products);
            transaction.commit();
            session.close();
            return true;
        }catch(Exception e){
            message("deleteProducts.error:"+e);
            e.printStackTrace();
            return false;
        }
    }

    //修改产品
    @Override
    public boolean updateProducts(Products products) {
        try{
            session=HibernateSessionFactory.getSession();
            transaction=session.beginTransaction();
            session.update(products);
            transaction.commit();
            session.close();
            return true;
        }catch(Exception e){
            message("updateProducts.error:"+e);
            e.printStackTrace();
            return false;
        }
    }

    //查找所有产品
    @Override
    public List findAllProducts() {
        session=HibernateSessionFactory.getSession();
        try{
            transaction=session.beginTransaction();
            String queryString="from Products ";
            query=session.createQuery(queryString);
            List list=query.list();
            transaction.commit();
            session.close();
            return list;
        }catch(Exception e){
            message("findProducts.error:"+e);
            e.printStackTrace();
            return null;
        }
    }

    //按照id查找产品
    @Override
    public Products idFindProducts(int pid) {
        session=HibernateSessionFactory.getSession();
        try{
            transaction=session.beginTransaction();
            Query query = session.createQuery("from Products where pid=?1");
            query.setParameter(1, pid);
            Products list= (Products) query.uniqueResult();
            transaction.commit();
            session.close();
            return list;
        }catch(Exception e){
            message("findInfo.error:"+e);
            e.printStackTrace();
            return null;
        }
    }

    //根据id或产品名称或简介查找产品
    @Override
    public List findProducts(int pid, String pname, String introduction) {
        session=HibernateSessionFactory.getSession();
        try{
            transaction=session.beginTransaction();
            String queryString="from Products where pid=? or pname=? or introduction=?";
            query.setParameter(0, pid);
            query.setParameter(1, pname);
            query.setParameter(2, introduction);
            query=session.createQuery(queryString);
            List list=query.list();
            transaction.commit();
            session.close();
            return list;
        }catch(Exception e){
            message("findProducts.error:"+e);
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
