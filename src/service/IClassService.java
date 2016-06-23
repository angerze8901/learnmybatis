package service;

import java.util.List;
import java.util.Map;

import model.Classes;

/**
 * @Description:
 * @author:wangze
 * @CreateDate: 2016年6月23日
 * @version: V1.0
 */
public interface IClassService
{
    List<Classes> queryClasses(Map<String, Object> param);
}
