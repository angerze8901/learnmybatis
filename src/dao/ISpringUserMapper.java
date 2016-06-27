package dao;

import java.util.List;

import model.SpringUser;

/**
 * @Description:
 * @author:wangze
 * @CreateDate: 2016年6月26日
 * @version: V1.0
 */
public interface ISpringUserMapper
{
    void save(SpringUser springUser);

    void update(SpringUser springUser);

    void delete(int id);

    SpringUser findById(int id);

    List<SpringUser> findAll();
}
