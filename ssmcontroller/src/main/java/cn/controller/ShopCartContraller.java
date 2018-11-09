package cn.controller;

import cn.pojo.Goods;
import cn.service.impl.ShopCartServiceImpl;


import com.wordnik.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("scc/")
@Controller
@Api(value="购物车功能模块接口",description="具体描述")
public class ShopCartContraller {
    @Autowired
    @Qualifier("scsi")
    private ShopCartServiceImpl scsi;

    public ShopCartServiceImpl getScsi() {
        return this.scsi;
    }
    public void setScsi(ShopCartServiceImpl scsi) {
        this.scsi = scsi;
    }
    @ApiOperation(value="商品加入购物车",httpMethod="POST",notes="返回添加是否成功",response = String.class)
    @RequestMapping(value = "sc")
    @ResponseBody
    public String shopCart(@ApiParam(name = "gd",required = true,value = "商品详细信息") @RequestBody Goods gd, @ApiParam(name = "uopenid",value ="用户唯一标识" ,required = true)@RequestBody String uopenid){
        return scsi.shop(gd,uopenid);
    }

    @RequestMapping(value = "scs")
    @ResponseBody
    @ApiOperation(value="购物车商品展示",httpMethod="POST",notes="展示商品",response = String.class)
    public String shopCartShow(@ApiParam(name = "uopenid",required = true,value = "用户唯一标识")@RequestBody String uopenid){
        return scsi.shopCart(uopenid);
    }
    @ApiOperation(value="购物车商品删除",httpMethod="POST",notes="是否删除成功",response = String.class)
    @RequestMapping(value = "scd")
    @ResponseBody
    public String shopCartDel(@ApiParam(name = "shopname",required = true,value = "商品名称")@RequestBody String shopname){
        return scsi.deShop(shopname);
    }
}
