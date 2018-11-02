package cn.service.impl;

import cn.dao.CouponDao;
import cn.pojo.Coupon;
import cn.pojo.Ucoupon;
import cn.service.CouponService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import java.util.List;

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
     * @param uc
     * @return
     */
    @Override
    public String addUserUcoupon(Ucoupon uc) {
        int count = 0;
        String str = null;
        uc.getUcid();
        uc.getUcname();
        count = couponDao.addUserUcoupon(uc);
        if (count == 0){
            str = "添加失败";
        }else if (count == 1){
            str = "添加成功";
        }
        str = JSON.toJSONString(str);
        return str;
    }

    /**
     * 用户使用优惠券
     *
     * @param uid 用户编号
     * @return
     */
    @Override
    public String updUcoupon(int cid, int uid) {
        int count = 0;
        count = couponDao.updUcoupon(cid,uid);
        String str = "使用成功";
        return str;
    }



}
