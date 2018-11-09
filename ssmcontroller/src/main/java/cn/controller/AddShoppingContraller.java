package cn.controller;

import cn.pojo.Order;
import cn.pojo.Ordergoods;
import cn.service.AddShoppingService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiImplicitParam;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@RequestMapping("addshop/")
@Controller
@Api(value="订单模块接口",description="具体描述")
public class AddShoppingContraller {
    @Autowired
    @Qualifier("addshop")
    private AddShoppingService ass;
    public AddShoppingService getAss() {return this.ass;}
    public void setAss(AddShoppingService ass) {this.ass = ass; }

    @RequestMapping(value = "addshopping")
    @ResponseBody
    @ApiOperation(value="订单商品",httpMethod="POST",notes="返回JSON订单商品信息",response = String.class)
    public String addShopping(@ApiParam(required = true, name ="odg", value ="订单商品详情")@RequestBody Ordergoods odg){
        return ass.addSho(odg);
    }


    @RequestMapping(value = "addshops")
    @ResponseBody
    @ApiOperation(value="订单添加展示",httpMethod="POST",notes="返回Map订单信息",response = Map.class)
    public Map<String, String> addShop(@ApiParam(name = "od",required = true,value = "订单详情")@RequestBody Order od){
        return ass.addShop(od);
    }
}
