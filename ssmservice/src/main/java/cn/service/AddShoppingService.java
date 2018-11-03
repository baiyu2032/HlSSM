package cn.service;

import cn.pojo.Order;
import cn.pojo.Ordergoods;

import java.util.Map;

public interface AddShoppingService {
    /**
     * 展示订单信息
     * @return  订单信息
     */
    Map<String,String> addShop(Order od);
    /**
     * 展示订单商品信息
     * @return 订单商品信息
     */
    String addSho(Ordergoods od);

    /**
     *冗余代码提取
     * @return
     */
    Map<String,String> extract(Order od,Ordergoods odgd);
}
