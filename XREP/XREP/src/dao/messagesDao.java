package dao;

import bean.Messages;

import java.util.List;

public interface messagesDao {


    //添加留言
    public boolean  addMessages(Messages messages);

    //删除留言
    public boolean deleteMessage(int messageid);

    //修改留言
    public boolean updateMessages(Messages messages);

    //查找所有留言
    public List findAllmessage();

    //按照留言id查找留言
    public Messages idFindmessage(int messageid);

    public List findMessages(int account,String writetime,String content,String username);

}
