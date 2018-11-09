package cn.service.impl;

import cn.pojo.Goods;
import cn.service.ShopCartService;
import com.alibaba.fastjson.JSONArray;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
@Service("scsi")
public class ShopCartServiceImpl implements ShopCartService {
      private RedisTemplate<String,String> redisTemplate;
    /**
     * 商品加入购物车
     * @param uopenid 用户微信标识
     * @param gd   商品信息
     * @return 购物车商品信息
     */
    @Override
    public String shop(Goods gd,String uopenid) {
        Map<String,Goods> m = new HashMap<String, Goods>();
        HashOperations<String,String,Goods> ops = redisTemplate.opsForHash();
        //商品名和商品对象
        m.put(gd.getGname(),gd);
        //用户唯一标识和商品名、商品对象
        ops.put(uopenid,gd.getGname(),gd);
        //设置订单保存时长一小时
        redisTemplate.expire(uopenid,60*60, TimeUnit.SECONDS);
        String sb = null;
        if(ops != null){
            sb = "添加成功";
        }else{
            sb = "添加失败";
        }
        return sb;
    }

    /**
     * 购物车商品展示
     * @param uopenid 用户微信标识
     * @return  购物车商品
     */
    @Override
    public String shopCart(String uopenid){
        HashOperations<String,String,Goods> ops = redisTemplate.opsForHash();
        List<Goods> lgd = ops.values(uopenid);
        return JSONArray.toJSONString(lgd);
    }

    /**
     * 删除购物车对应商品
     * @return 删除是否成功
     */
    @Override
    public String deShop(String name){
        HashOperations<String,String,Goods> ops = redisTemplate.opsForHash();
        Map<String,Goods> mp = ops.entries(name);
        String succ = null;
        for(Goods g : mp.values()){
            if(g.getGname() == name){
                mp.remove(0);
                succ = "删除成功";
            }else {
                succ = "删除失败";
            }
        }
        return succ;
    }

}
