package cn.controller;

import cn.pojo.Goods;
import cn.service.impl.ShopCartServiceImpl;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("scc/")
@Controller
@Api(value="页面展示",description="具体描述")
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
    @ApiOperation(value="商品加入购物车",httpMethod="POST",notes="返回添加是否成功")
    public String shopCart(@RequestBody Goods gd,@RequestBody String uopenid){
        return scsi.shop(gd,uopenid);
    }
    @ApiOperation(value="购物车商品展示",httpMethod="POST",notes="展示商品")
    public String shopCartShow(@RequestBody String uopenid){
        return scsi.shopCart(uopenid);
    }
    @ApiOperation(value="购物车商品删除",httpMethod="POST",notes="是否删除成功")
    public String shopCartDel(@RequestBody String shopname){
        return scsi.deShop(shopname);
    }
}
