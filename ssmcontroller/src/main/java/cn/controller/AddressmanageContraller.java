package cn.controller;

import cn.pojo.Address;
import cn.service.AddressmanageService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping(value = "addLocal.html",method = RequestMethod.POST)
    @ApiOperation(value="新增地址",httpMethod="POST",notes="返回新增情况")
    public String addlocal(@ApiParam(required = true, name ="address", value ="地址对象")@RequestBody Address address){
        return local.addLocal(address);
    }


    @ResponseBody
    @RequestMapping(value = "upDateLocal.html",method=RequestMethod.POST)
    @ApiOperation(value="更新地址",httpMethod="POST",notes="返回更新情况")
    public String updateLocal(@ApiParam(required = true, name ="address", value ="地址对象")@RequestBody Address address){
        return local.updateLocal(address);
    }

    @ResponseBody
    @RequestMapping(value = "delLocal.html/{uid}/{aid}",method = RequestMethod.GET)
    @ApiOperation(value="删除地址",httpMethod="GET",notes="返回删除情况")
    public String delLocal( @ApiParam(required = true, name ="uid", value ="用户ID")@PathVariable("uid")int uid, @ApiParam(required = true, name ="aid", value ="地址ID")@PathVariable("aid")int aid){
        return local.delLocal(uid,aid);
    }

    @ResponseBody
    @RequestMapping(value = "selLocal.html/{uid}",method = RequestMethod.GET)
    @ApiOperation(value="查找用户收货地址",httpMethod="GET",notes="返回查询情况")
    public String selsectlocal(@ApiParam(required = true, name ="uid", value ="用户ID")@PathVariable("uid") int uid){
     return local.selLocal(uid);
    }

    @ResponseBody
    @RequestMapping(value = "selLocalInfo.html/{aid}/{uid}",method = RequestMethod.GET)
    @ApiOperation(value="查找用户单条收货地址",httpMethod="GET",notes="返回查询情况")
    public String selLocalInfo(@ApiParam(required = true, name ="aid", value ="地址ID")@PathVariable("aid")int aid,@ApiParam(required = true, name ="uid", value ="用户ID")@PathVariable("uid")int uid){
        return local.selLoncalinfo(aid,uid);
    }
}
