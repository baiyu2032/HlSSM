package cn.dao;

import cn.pojo.Ordergoods;
import org.springframework.stereotype.Repository;

@Repository("ordergoods")
public interface OrdergoodsDao {
    /**
     * 新增订单商品信息
     * @param odg   订单商品信息
     * @return 订单商品信息
     */
 int addOrdergoods(Ordergoods odg);

}
