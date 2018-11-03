package cn.service;

import cn.pojo.Coupon;
import cn.pojo.Ucoupon;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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
     * @param cid 优惠券编号
     * @param uid 用户编号
     * @return
     */
    String addUserUcoupon(int cid, int uid);

    /**
     * 用户使用优惠券
     * @param cid 优惠券编号
     * @param uid 用户编号
     * @return
     */
    String updUcoupon(int cid, int uid);

    /**
     * 显示用户所有优惠券信息
     * @param uid 用户编号
     * @return
     */
    String selUserCoupon(int uid);

    /**
     * 显示优惠券状态 (0.未领取 1.已领取 2.已使用)
     * @param uid 用户编号
     * @return
     */
    String selCoupon(int uid);
}
