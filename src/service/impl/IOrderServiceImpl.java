package service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import dao.impl.OrderDaoImpl;
import model.Order;
import service.IOrderService;

/**
 * @Description:
 * @author:wangze
 * @CreateDate: 2016ƒÍ6‘¬23»’
 * @version: V1.0
 */
public class IOrderServiceImpl implements IOrderService
{

    @Override
    public List<Order> queryOrders(final Map<String, Object> param)
    {
        OrderDaoImpl orderDao = new OrderDaoImpl();
        List<Order> listOrder = orderDao.queryOrders(param);
        return listOrder;
    }

    //≤‚ ‘
    public static void main(final String[] args)
    {
        Logger LOG = Logger.getLogger(IOrderServiceImpl.class);
        IOrderServiceImpl orderService = new IOrderServiceImpl();
        Map<String, Object> param = new HashMap<>();
        param.put("order_id", 1);
        LOG.info(param);
        List<Order> listOrder = orderService.queryOrders(param);
        System.out.println(listOrder);
    }
}
