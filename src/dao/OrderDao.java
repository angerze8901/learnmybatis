package dao;

import java.util.List;
import java.util.Map;

import model.Order;

/**
 * @Description:
 * @author:wangze
 * @CreateDate: 2016��6��23��
 * @version: V1.0
 */
public interface OrderDao
{
    List<Order> queryOrders(Map<String, Object> param);
}
