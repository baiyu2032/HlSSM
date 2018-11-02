/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: AddressmanageContraller
 * Author:   13654
 * Date:     2018/11/1 17:03
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
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
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;

@RequestMapping("address/")
@Controller
@Api(value = "管理地址",description = "描述信息")
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
    @RequestMapping(value = "addlocal")
    @ApiOperation(value="新增地址",httpMethod="POST",notes="返回新增情况")
    public String addlocal(@ApiParam(required = true, name ="地址对象", value ="将参数对象打包为json传入")@RequestBody Address address){
        return local.Addlocal(address);
    }

}
