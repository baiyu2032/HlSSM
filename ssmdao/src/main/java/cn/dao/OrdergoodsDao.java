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

    /**
     * 根据对应id查询对应订单商品
     * @param id id
     * @return 订单商品信息
     */
    Ordergoods selOrdergoods(long id);
}
