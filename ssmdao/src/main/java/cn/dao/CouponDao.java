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
    int addUserUcoupon(@Param("cid")int cid, @Param("uname")int uname);

    /**
     * 用户使用优惠券
     * @return
     */
    int updUcoupon(@Param("cid")int cid, @Param("uid")int uname);

    /**
     * 显示用户所有优惠券信息
     * @return
     */
    List<Ucoupon> selUserCoupon(@Param("uname") int uname);
    /**
     * 显示优惠券状态 (0.未领取 1.已领取 2.已使用)
     * @return
     */
    int selCoupon(@Param("uname")int uname);


    /**
     * 查询用户是否已有该张优惠卷
     * @return
     */
    int selCon(@Param("cid")int cid, @Param("uname")int uname);
}
