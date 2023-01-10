package dao;


import bean.News;

import java.util.List;

public interface newsDao {
    //添加留言
    public boolean  addNews(News news);

    //删除留言
    public boolean deleteNews(int nid);

    //修改留言
    public boolean updateNew(News news);

    //查找所有留言
    public List findAllNews();

    //按照留言id查找留言
    public News idFindNews(int nid);

    public List findNews(int nid,String title,String ncontent);
}
