package dao;

import java.util.List;
import java.util.Map;

import model.User;

/**
 * @Description:
 * @author:wangze
 * @CreateDate: 2016��6��22��
 * @version: V1.0
 */
public interface UserDao
{
    List<User> queryUserList(Map<String, Object> param);
}
