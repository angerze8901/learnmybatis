package dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.UserDao;
import dao.support.MybatisUtil;
import model.ConditionUser;
import model.User;

/**
 * @Description:
 * @author:wangze
 * @CreateDate: 2016��6��22��
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

    @Override
    public List<ConditionUser> queryConditionUserList(final Map<String, Object> param)
    {

        return MybatisUtil.openSqlSession().selectList(NAME_SPACE, param);
    }

    //main��ʽ����,���ѡ��service�����
    public static void main(final String[] args)
    {
        //        UserDaoImpl testuser = new UserDaoImpl();
        //        Map<String, Object> param = new HashMap<>();
        //        param.put("id", 1);
        //        List<User> us = testuser.queryUserList(param);
        //        System.out.println(us);

        UserDaoImpl testuserCon = new UserDaoImpl();
        Map<String, Object> paramMap = new HashMap<>();
        //        ConditionUser conUser = new ConditionUser("%o%", 1, 12);

        paramMap.put("name", "%o%");
        paramMap.put("minAge", 1);
        paramMap.put("maxAge", 19);
        List<User> listConditionUser = testuserCon.queryUserList(paramMap);
        System.out.println(listConditionUser);
    }
}
