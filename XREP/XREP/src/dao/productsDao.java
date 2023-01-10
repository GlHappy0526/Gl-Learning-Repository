package dao;


import bean.Products;

import java.util.List;

public interface productsDao {
    //添加留言
    public boolean  addProducts(Products products);

    //删除留言
    public boolean deleteProducts(int pid);

    //修改留言
    public boolean updateProducts(Products products);

    //查找所有留言
    public List findAllProducts();

    //按照留言id查找留言
    public Products idFindProducts(int pid);

    public List findProducts(int pid,String pname,String introduction);
}
