package cn.controller;

import cn.service.CouponService;
import com.wordnik.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("cou/")
@Controller
@Api(value = "优惠券功能模块",description = "具体描述")
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
    @RequestMapping(value = "selCouponInfo",method = RequestMethod.POST)
    @ApiOperation(value="查看优惠券信息",httpMethod="POST",notes="优惠券信息详情",response = String.class)
    public String showGet() {
        return cs.selCouponInfo();
    }

    /**
     * 用户添加优惠券
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "addUserUcoupon",method = RequestMethod.POST)
    @ApiOperation(value="用户添加优惠券信息",httpMethod="POST",notes="返回添加情况")
    public String showAdd(@ApiParam(name = "cid", value = "优惠券编号", required = true) @RequestParam("cid")int cid,@ApiParam(name = "uname", value = "用户编号", required = true) @RequestParam("uname")int uname) {
        return cs.addUserUcoupon(cid,uname);
    }

    /**
     * 用户使用优惠券
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "updUcoupon",method = RequestMethod.POST)
    @ApiOperation(value="用户使用优惠券",httpMethod="GET",notes="返回使用情况")
    public String showUpd(@ApiParam(name = "cid", value = "优惠券编号", required = true)@RequestParam("cid")int cid,@ApiParam(name = "uname", value = "用户编号", required = true)@RequestParam("uname") int uname) {
        return cs.updUcoupon(cid,uname);
    }

    /**
     * 显示用户所有优惠券信息
     * @param uname 用户ID
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "selAllUcoupon",method = RequestMethod.POST)
    @ApiOperation(value="显示用户所有优惠券信息",httpMethod="POST",notes="返回优惠券情况")
    public String selUserCoupon(@ApiParam(name = "uname", value = "用户编号", required = true)@RequestParam("uname")int uname) {
        return cs.selUserCoupon(uname);
    }

    /**
     * 显示用户优惠券状态
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "selCoupon",method = RequestMethod.POST)
    @ApiOperation(value="显示用户所有优惠券状态",httpMethod="POST",notes="显示用户优惠券状态")
    public String showSelCoupon(@ApiParam( name = "uname", value = "用户编号", required = true)@RequestParam("uname")int uname) {
        return cs.selCoupon(uname);
    }
}
