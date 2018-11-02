package cn.dao;

import cn.pojo.Order;
import org.springframework.stereotype.Repository;

@Repository("order")
public interface OrderDao {
    /**
     * 新增订单信息
     * @param od 订单信息
     * @return 订单信息
     */
    int addOrder(Order od);

    /**
     * 查询是否有存在的订单
     * @return 订单信息
     */
    Order selOrder();
}
