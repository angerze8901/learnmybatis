package service;

import java.util.List;
import java.util.Map;

import model.User;

/**
 * @Description:
 * @author:wangze
 * @CreateDate: 2016��6��22��
 * @version: V1.0
 */
public interface IUserService
{
    List<User> queryUserList(Map<String, Object> param);
}
