package dao;

import java.util.List;
import java.util.Map;

import model.Classes;

/**
 * @Description:
 * @author:wangze
 * @CreateDate: 2016Äê6ÔÂ23ÈÕ
 * @version: V1.0
 */
public interface ClassDao
{
    List<Classes> queryClass(Map<String, Object> param);
}
