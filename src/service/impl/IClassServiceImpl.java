package service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.impl.ClassDaoImpl;
import model.Classes;
import service.IClassService;

/**
 * @Description:
 * @author:wangze
 * @CreateDate: 2016年6月23日
 * @version: V1.0
 */
public class IClassServiceImpl implements IClassService
{

    @Override
    public List<Classes> queryClasses(final Map<String, Object> param)
    {
        ClassDaoImpl classDaoImpl = new ClassDaoImpl();
        List<Classes> listClasses = classDaoImpl.queryClass(param);
        return listClasses;
    }

    public static void main(final String[] args)
    {
        IClassServiceImpl iclassedServiceImpl = new IClassServiceImpl();
        Map<String, Object> param = new HashMap<>();
        param.put("c_id", 1);
        List<Classes> listClasses = iclassedServiceImpl.queryClasses(param);
        System.out.println(listClasses);
    }
}
