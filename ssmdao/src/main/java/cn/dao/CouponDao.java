package cn.dao;

import cn.pojo.Coupon;
import cn.pojo.Ucoupon;
import cn.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("cd")
public interface CouponDao {
    /**
     * 显示所有优惠券
     * @return
     */
    List<Coupon> selAll();

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
     * 用户使用券更新状态
     * @return
     */
    int updateUclogo(int uid);

    /**
     * 用户领取优惠券
     * @param uid
     * @return
     */
    int addUclogo(int uid);
}
