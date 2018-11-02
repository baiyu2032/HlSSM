package cn.service.impl;

import cn.dao.OrderDao;
import cn.dao.OrdergoodsDao;
import cn.pojo.Order;
import cn.pojo.Ordergoods;
import cn.service.AddShoppingService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("addshop")
public class AddShoppingServiceImpl implements AddShoppingService {
    @Autowired
    @Qualifier("order")
    private OrderDao odd;
    public OrderDao getOdd() {return this.odd;}
    public void setOdd(OrderDao odd) {this.odd = odd;}
    @Autowired
    @Qualifier("ordergoods")
    private OrdergoodsDao odgd;
    public OrdergoodsDao getOdgd() {return this.odgd;}
    public void setOdgd(OrdergoodsDao odgd) {this.odgd = odgd;}

    /**
     * 展示订单信息
     * @return  订单信息
     */
    @Override
    public String addShop(Order od) {
        String info = null;
        Order ods = odd.selOrder();
        if(ods != null){
            info = JSON.toJSONString(ods);
        }else{
            int odr = odd.addOrder(od);
            if(odr != 0){
                info = JSON.toJSONString(od);
            }else{
                info = "信息走失喽!!!";
            }
        }
        return info;
    }

    /**
     * 展示订单商品信息
     * @return 订单商品信息
     */
    @Override
    public String addSho(Ordergoods odg) {
        String shopinfo = null;
        int od = odgd.addOrdergoods(odg);
        if(od != 0){
            shopinfo = JSON.toJSONString(odg);
        }else{
            shopinfo = "信息走失喽!!!";
        }
        return shopinfo;
    }

}
