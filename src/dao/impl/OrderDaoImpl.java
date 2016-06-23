package dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.OrderDao;
import dao.support.MybatisUtil;
import model.Order;

/**
 * @Description:
 * @author:wangze
 * @CreateDate: 2016Äê6ÔÂ23ÈÕ
 * @version: V1.0
 */
public class OrderDaoImpl implements OrderDao
{
    private String NAME_SPACE1 = "userMapperOrder.selectOrderMap";

    @Override
    public List<Order> queryOrders(final Map<String, Object> param)
    {

        return MybatisUtil.openSqlSession().selectList(NAME_SPACE1, param);
    }

    public static void main(final String[] args)
    {
        OrderDaoImpl orderDao = new OrderDaoImpl();
        Map<String, Object> param = new HashMap<>();
        param.put("order_id", 2);
        List<Order> us = orderDao.queryOrders(param);
        System.out.println(us);
    }
}
