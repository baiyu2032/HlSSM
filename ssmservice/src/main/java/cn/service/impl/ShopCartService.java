package cn.service.impl;

import cn.pojo.Goods;

public interface ShopCartService {
    /**
     * 商品加入购物车
     * @param uopenid 用户微信标识
     * @param gd   商品信息
     * @return  购物车中的商品
     */
    String shop(Goods gd,String uopenid);

    /**
     * 购物车商品展示
     * @param uopenid 用户微信标识
     * @return购物车商品
     */
    String shopCart(String uopenid);

    /**
     * 删除购物车对应商品
     * @param name 商品名称
     * @return 删除是否成功
     */
    String deShop(String name);
}
