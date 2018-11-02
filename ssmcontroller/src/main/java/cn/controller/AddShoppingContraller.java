package cn.controller;

import cn.pojo.Order;
import cn.pojo.Ordergoods;
import cn.service.AddShoppingService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("addshop/")
@Controller
@Api(value="页面展示",description="具体描述")
public class AddShoppingContraller {
    @Autowired
    @Qualifier("addshop")
    private AddShoppingService ass;
    public AddShoppingService getAss() {return this.ass;}
    public void setAss(AddShoppingService ass) {this.ass = ass; }

    @RequestMapping(value = "addshopping")
    @ResponseBody
    @ApiOperation(value="订单商品展示",httpMethod="post",notes="返回JSON订单商品信息")
    public String addShopping(@ApiParam(required = true, name ="参数", value ="将参数对象打包为json传入")@RequestBody Ordergoods odg){
        return ass.addSho(odg);
    }


    @RequestMapping(value = "addshops")
    @ResponseBody
    @ApiOperation(value="订单展示",httpMethod="POST",notes="返回JSON订单信息")
    public String addShop(@RequestBody Order od){
        return ass.addShop(od);
    }
}
