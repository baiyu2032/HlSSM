package cn.controller;

import cn.pojo.Ucoupon;
import cn.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("cou/")
@Controller
public class CouponController {
    @Autowired
    private CouponService cs;
    public CouponService getCs() { return this.cs; }
    public void setCs(CouponService cs) {
        this.cs = cs;
    }

    @ResponseBody
    @RequestMapping(value = "selCouponInfo")
    public String showGet() {
        return cs.selCouponInfo();
    }

    @ResponseBody
    @RequestMapping(value = "addUserUcoupon" )
    public String showAdd(Ucoupon uc) {
        return cs.addUserUcoupon(uc);
    }
}
