package cn.dao;

import cn.pojo.Coupon;
import cn.pojo.Ucoupon;
import cn.pojo.User;
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
     * @param uid 用户ID
     * @return
     */
    List<Ucoupon> selUserCoupon(@Param("uid")int uid);



    /**
     * 查询用户信息
     * @param uid 用户ID
     * @return
     */
    User selUser(int uid);

    /**
     * 用户所有劵状态 0.未使用 1.被占用 2.已使用
     * @param uid 用户ID
     * @return
     */
    Ucoupon selUclogo(int uid);

    /**
     * 用户领取优惠券
     * @param uid
     * @return
     */
    int addUclogo(int uid);
}
