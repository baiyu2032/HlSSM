package cn.service;

import cn.pojo.Ucoupon;
import org.apache.ibatis.annotations.Param;

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

    /**
     * 显示用户所有优惠券信息
     * @param uc 用户ID
     * @return
     */
    int selUserCoupon(Ucoupon uc);

    /**
     * 显示优惠券状态 (0.未领取 1.被占用 2.已使用)
     * @return
     */
    String selCoupon(Ucoupon uc);

}
