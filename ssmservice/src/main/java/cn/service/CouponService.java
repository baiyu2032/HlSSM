package cn.service;

import cn.pojo.Ucoupon;

/**
 * 优惠券
 */
public interface CouponService {
    /**
     * 展示优惠券信息
     * @return
     */
    String selCouponInfo();

    /**
     * 用户添加优惠券
     * @param uc
     * @return
     */
    String addUserUcoupon(Ucoupon uc);

    /**
     * 用户使用优惠券
     * @param uid 用户编号
     * @return
     */
    String updUcoupon(int cid,int uid);
}
