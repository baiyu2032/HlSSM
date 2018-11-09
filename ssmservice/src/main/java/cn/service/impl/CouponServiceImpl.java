package cn.service.impl;

import cn.dao.CouponDao;
import cn.pojo.Coupon;
import cn.pojo.Ucoupon;
import cn.service.CouponService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("csi")
public class CouponServiceImpl implements CouponService {
    @Autowired
    @Qualifier("cd")
    private CouponDao couponDao;
    public CouponDao getCouponDao() { return this.couponDao; }
    public void setCouponDao(CouponDao couponDao) {
        this.couponDao = couponDao;
    }

    /**
     * 展示优惠券信息
     *
     * @return
     */
    @Override
    public String selCouponInfo() {
        List<Coupon> clist = couponDao.selCouponInfo();
        String s = JSON.toJSONString(clist);
        return s;
    }

    /**
     * 用户添加优惠券
     *
     * @param cid
     * @return
     */
    @Override
    public String addUserUcoupon(int cid,int uname) {
        Map<String,Object> map = new HashMap<String, Object>();
        int count = 0;
        String str = "";
        int con = couponDao.selCon(cid, uname);
        if (con!=0) {
            map.put("code", "2");
            map.put("mrremg", "已有不可重复添加！");
            return JSON.toJSONString(map);
        }
        count = couponDao.addUserUcoupon(cid,uname);
        if (count == 0){
            map.put("code","1");
            map.put("mrremg","添加失败");
        }else if (count == 1) {
            map.put("code","0");
            map.put("mrremg","添加成功");
        }
        return JSON.toJSONString(map);
    }

    /**
     * 用户使用优惠券
     *
     * @return
     */
    @Override
    public String updUcoupon(int cid, int uname) {
        int count = 0;
        count = couponDao.updUcoupon(cid,uname);
        String str = "使用成功";
        return str;
    }

    /**
     * 显示用户所有优惠券信息
     *
     * @return
     */
    @Override
    public String selUserCoupon(int uname) {
        List<Ucoupon> ucoupons = couponDao.selUserCoupon(uname);
        return JSON.toJSONString(ucoupons);
    }

    /**
     * 显示优惠券状态 (0.未领取 1.被占用 2.已使用)
     *
     * @return
     */
    @Override
    public String selCoupon(int uname) {
        String str = "";
        int count = couponDao.selCoupon(uname);
        if (count == 0) {
            str = "未领取！";
        }else if (count == 1) {
            str = "已领取！";
        }else {
            str = "已使用！";
        }
        str = JSON.toJSONString(str);
        return str;
    }
}
