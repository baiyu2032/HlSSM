package cn.controller;

import cn.pojo.Ucoupon;
import cn.service.CouponService;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    /**
     * 展示优惠券信息
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "selCouponInfo")
    @ApiOperation(value="查看优惠券信息",httpMethod="POST",notes="返回查看信息")
    public String showGet() {
        return cs.selCouponInfo();
    }

    /**
     * 用户添加优惠券
     * @param uc
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "addUserUcoupon" )
    @ApiOperation(value="用户添加优惠券信息",httpMethod="POST",notes="返回添加情况")
    public String showAdd(@ApiParam(required = true, name ="用户拥有优惠券对象", value ="将参数对象打包为json传入")@RequestBody Ucoupon uc) {
        return cs.addUserUcoupon(uc);
    }

    /**
     * 用户使用优惠券
     * @param cid 优惠券编号
     * @param uid 用户编号
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "updUcoupon" )
    @ApiOperation(value="用户使用优惠券",httpMethod="GET",notes="返回使用情况")
    public String showUpd(@RequestParam("cid")int cid,@RequestParam("uid") int uid) {
        return cs.updUcoupon(cid,uid);
    }

    /**
     * 显示用户所有优惠券信息
     * @param uc 用户ID
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "selAllUcoupon" )
    @ApiOperation(value="显示用户所有优惠券信息",httpMethod="POST",notes="返回优惠券情况")
    public String selUserCoupon(@RequestBody Ucoupon uc) {
        return cs.addUserUcoupon(uc);
    }


    /**
     * 显示用户优惠券状态
     * @param uc
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "selCoupon" )
    @ApiOperation(value="显示用户优惠券",httpMethod="POST",notes="返回显示情况")
    public String showSelCoupon(@ApiParam(required = true, name ="用户拥有优惠券对象", value ="将参数对象打包为json传入")@RequestBody Ucoupon uc) {
        return cs.selCoupon(uc);
    }
}
