package dao;

import java.util.List;
import java.util.Map;

import model.Teacher;

/**
 * @Description:
 * @author:wangze
 * @CreateDate: 2016Äê6ÔÂ23ÈÕ
 * @version: V1.0
 */
public interface TeacherDao
{
    List<Teacher> queryClass(Map<String, Object> param);
}
