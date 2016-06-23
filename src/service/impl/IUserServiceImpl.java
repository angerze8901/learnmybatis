package service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.impl.UserDaoImpl;
import model.User;
import service.IUserService;

/**
 * @Description:
 * @author:wangze
 * @CreateDate: 2016��6��22��
 * @version: V1.0
 */
public class IUserServiceImpl implements IUserService
{

    @Override
    public List<User> queryUserList(final Map<String, Object> param)
    {
        UserDaoImpl userdao = new UserDaoImpl();

        param.put("id", 14);

        List<User> listUser = userdao.queryUserList(param);
        //        return userdao.queryUserList(param);
        return listUser;
    }

    public static void main(final String[] args)
    {
        IUserServiceImpl userImpl = new IUserServiceImpl();
        Map<String, Object> param = new HashMap<>();
        param.put("id", 2);
        List<User> listUser = userImpl.queryUserList(param);
        System.out.println(listUser);
    }
}
