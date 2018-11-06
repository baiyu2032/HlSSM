package cn.controller;

import cn.pojo.Address;
import cn.service.AddressmanageService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@RequestMapping("address/")
@Controller
@Api(value = "address/",description = "管理地址")
public class AddressmanageContraller {

    @Autowired
    @Qualifier("localser")

    private AddressmanageService local;

    public AddressmanageService getAddressmanageService() {
        return this.local;
    }

    public void setAddressmanageService(AddressmanageService addressmanageService) {
        this.local = addressmanageService;
    }

    @ResponseBody
    @RequestMapping(value = "addLocal")
    @ApiOperation(value="新增地址",httpMethod="POST",notes="返回新增情况")
    public String addlocal(@ApiParam(required = true, name ="新增地址参数对象", value ="将参数对象打包为json传入")@RequestBody Address address){
        return local.addLocal(address);
    }


    @ResponseBody
    @RequestMapping(value = "upDateLocal")
    @ApiOperation(value="更新地址",httpMethod="POST",notes="返回更新情况")
    public String updateLocal(@ApiParam(required = true, name ="更改地址参数", value ="将参数对象打包为json传入")@RequestBody Address address){
        return local.updateLocal(address);
    }

    @ResponseBody
    @RequestMapping(value = "delLocal")
    @ApiOperation(value="删除地址",httpMethod="POST",notes="返回删除情况")
    public String delLocal(@RequestParam("uid")int uid, @RequestParam("aid")int aid){
        return local.delLocal(uid,aid);
    }

    @ResponseBody
    @RequestMapping(value = "selLocal")
    @ApiOperation(value="查找用户收货地址",httpMethod="GET",notes="返回查询情况")
    public String selsectlocal(@RequestParam("uid") int uid){
     return local.selLocal(uid);
    }

    @ResponseBody
    @RequestMapping(value = "selLocalInfo")
    @ApiOperation(value="查找用户单条收货地址",httpMethod="GET",notes="返回查询情况")
    public String selLocalInfo(@RequestParam("aid") int aid,@RequestParam("uid") int uid){
        return local.selLoncalinfo(aid,uid);
    }
}
