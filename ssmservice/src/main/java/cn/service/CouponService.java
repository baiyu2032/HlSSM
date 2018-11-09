package cn.service;

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
     * @return
     */
    String addUserUcoupon(int cid , int uname);

    /**
     * 用户使用优惠券
     * @return
     */
    String updUcoupon(int cid,int uname);

    /**
     * 显示用户所有优惠券信息
     * @return
     */
    String selUserCoupon(int uname);

    /**
     * 显示优惠券状态 (0.未领取 1.被占用 2.已使用)
     * @return
     */
    String selCoupon(int uname);
}
