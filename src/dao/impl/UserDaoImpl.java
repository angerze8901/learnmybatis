package dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.UserDao;
import dao.support.MybatisUtil;
import model.User;

/**
 * @Description:
 * @author:wangze
 * @CreateDate: 2016年6月22日
 * @version: V1.0
 */
public class UserDaoImpl implements UserDao
{
    //    private String NAME_SPACE = UserDao.class.getName();
    private String NAME_SPACE = "userMapper.selectUser";

    @Override
    public List<User> queryUserList(final Map<String, Object> param)
    {

        return MybatisUtil.openSqlSession().selectList(NAME_SPACE, param);
    }

    //main方式测试,最好选择service层测试
    public static void main(final String[] args)
    {
        UserDaoImpl testuser = new UserDaoImpl();
        Map<String, Object> param = new HashMap<>();
        param.put("id", 1);
        List<User> us = testuser.queryUserList(param);
        System.out.println(us);
    }
}
