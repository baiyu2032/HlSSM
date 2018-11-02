package cn.dao;

import cn.pojo.Coupon;
import cn.pojo.Ucoupon;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository("cd")
public interface CouponDao {
    /**
     * 展示优惠券信息
     * @return
     */
    List<Coupon> selCouponInfo();

    /**
     * 用户添加优惠券
     * @return
     */
    int addUserUcoupon(Ucoupon uc);

    /**
     * 用户使用优惠券
     * @param uid 用户编号
     * @return
     */
    int updUcoupon(@Param("cid")int cid, @Param("uid")int uid);

    /**
     * 显示用户所有优惠券信息
     * @return
     */
    int selUserCoupon(Ucoupon uc);

    /**
     * 显示优惠券状态 (0.未领取 1.已领取 2.已使用)
     * @return
     */
    int selCoupon(Ucoupon uc);

}
