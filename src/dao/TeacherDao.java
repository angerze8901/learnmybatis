package dao;

import java.util.List;
import java.util.Map;

import model.Teacher;

/**
 * @Description:
 * @author:wangze
 * @CreateDate: 2016��6��23��
 * @version: V1.0
 */
public interface TeacherDao
{
    List<Teacher> queryClass(Map<String, Object> param);
}
