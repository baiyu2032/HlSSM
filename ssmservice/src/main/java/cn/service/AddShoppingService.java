package cn.service;

import cn.pojo.Order;
import cn.pojo.Ordergoods;

public interface AddShoppingService {
    /**
     * 展示订单信息
     * @return  订单信息
     */
    String addShop(Order od);
    /**
     * 展示订单商品信息
     * @return 订单商品信息
     */
    String addSho(Ordergoods od);
}
