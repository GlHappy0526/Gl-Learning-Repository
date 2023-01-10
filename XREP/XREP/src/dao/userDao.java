package dao;


import bean.Users;

import java.util.List;

public interface userDao {
    //添加用户
    public boolean  addUsers(Users users);

    //删除用户
    public boolean deleteUsers(int account);

    //修改用户
    public boolean updateUsers(Users users);

    //查找所有用户
    public List findAllUsers();

    //按照账号，密码查找用户
    public Users accountFindUsers(int account,String password);

    //按照账号查找用户
    public Users accountFindUser(int account);

    //按照昵称，密码查找用户
    public Users findUser(String nickname,String password);

}
