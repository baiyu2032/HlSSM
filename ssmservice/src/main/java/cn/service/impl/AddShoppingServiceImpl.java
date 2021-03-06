package cn.service.impl;

import cn.dao.OrderDao;
import cn.dao.OrdergoodsDao;
import cn.pojo.Order;
import cn.pojo.Ordergoods;
import cn.service.AddShoppingService;
import cn.service.UserCodingService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import util.DateUtil;

import java.util.HashMap;
import java.util.Map;

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
    @Autowired
    @Qualifier("ucs")
    private UserCodingService ucs;
    public UserCodingService getUcs() {
        return ucs;
    }
    public void setUcs(UserCodingService ucs) {
        this.ucs = ucs;
    }
    @Autowired
    @Qualifier("dt")
    private DateUtil dt;
    public DateUtil getDt() {
        return this.dt;
    }
    public void setDt(DateUtil dt) {
        this.dt = dt;
    }

    /**
     * 展示订单信息
     * @return  订单信息
     */
    @Override
    public Map<String, String> addShop(Order od) {
        Map<String,String> mp = null;
        String erro = "";
        Order ods = odd.selOrder();
        if(ods != null){
           Ordergoods odgdd = odgd.selOrdergoods(ods.getOgoods());
            //订单编码
            ods.setOnum(ucs.usernums(odgdd.getUopenid()));
            //订单时间
            ods.setOdate(dt.selDate());
           mp = extract(ods,odgdd);
        }else{
            int odr = odd.addOrder(od);
            if(odr != 0){
           Ordergoods odgdd = odgd.selOrdergoods(od.getOgoods());
           //订单编码
           od.setOnum(ucs.usernums(odgdd.getUopenid()));
           //订单时间
           od.setOdate(dt.selDate());
           mp = extract(od,odgdd);
            }else{
                mp .put(erro,"数据走失喽！！！");
            }
        }
        return mp;
    }

    /**
     * 添加订单商品信息
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
    /**
     * 冗余代码提取
     * @return
     */
    @Override
    public Map<String, String> extract(Order od,Ordergoods odgd) {
        Map<String,String> mp = new HashMap<String, String>();
        String info = "";
        String infos = "";
        String infoo = "";
        String infoos = "";
        infos = JSON.toJSONString(od);
        mp.put(info,infos);
        infoos = JSON.toJSONString(odgd);
        mp.put(infoo,infoos);
        return mp;
    }
}
