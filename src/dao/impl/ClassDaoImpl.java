package dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.ClassDao;
import dao.support.MybatisUtil;
import model.Classes;

/**
 * @Description:
 * @author:wangze
 * @CreateDate: 2016��6��23��
 * @version: V1.0
 */
public class ClassDaoImpl implements ClassDao
{
    private String NAME_SPACE = "ClassMapper.selectClass";

    @Override
    public List<Classes> queryClass(final Map<String, Object> param)
    {
        List<Classes> listClass = MybatisUtil.openSqlSession().selectList(NAME_SPACE, param);
        return listClass;
    }

    public static void main(final String[] args)
    {
        ClassDaoImpl classDaoImpl = new ClassDaoImpl();
        Map<String, Object> param = new HashMap<>();
        param.put("c_id", 1);
        //        param.put("t_id", 2);
        List<Classes> listClasses = classDaoImpl.queryClass(param);
        System.out.println(listClasses);
    }
}
