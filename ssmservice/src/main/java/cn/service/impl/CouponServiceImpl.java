package cn.service.impl;

import cn.dao.CouponDao;
import cn.pojo.Coupon;
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
     * 获得所有信息
     *
     * @return
     */
    @Override
    public String selAll() {
        List<Coupon> clist = couponDao.selAll();
        String s = JSON.toJSONString(clist);
        return s;
    }
}
