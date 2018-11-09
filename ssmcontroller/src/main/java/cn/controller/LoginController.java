/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: LoginController
 * Author:   13654
 * Date:     2018/11/4 16:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.controller;

import cn.service.impl.LoginUserServiceImpl;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("log/")
@Controller
@Api(value = "登录模块",description = "登录和注册功能接口")
public class LoginController {

    @Autowired
    @Qualifier("logUser")
    private LoginUserServiceImpl loginUserService;

    public LoginUserServiceImpl getLoginUserService() {
        return this.loginUserService;
    }

    public void setLoginUserService(LoginUserServiceImpl loginUserService) {
        this.loginUserService = loginUserService;
    }

    @ResponseBody
    @RequestMapping(value = "code.html/{code}",method = RequestMethod.GET)
    @ApiOperation(value="用户登录",httpMethod="GET",notes="返回登录情况")
    public String login(@ApiParam(name="code",value = "用户code码",required = true) @PathVariable("code") String code) {
        String loginfo = loginUserService.logUser(code);
        return loginfo;
    }


    @ResponseBody
    @RequestMapping(value = "addUser.html/{uname}/{code}",method = RequestMethod.GET)
    @ApiOperation(value="用户注册",httpMethod="GET",notes="返回注册情况")
    public String addToLogin(@ApiParam(name="uname",value = "用户名",required = true)@PathVariable("uname") String uname,@ApiParam(name="code",value = "用户code码",required = true)@PathVariable("code") String code) {
        return loginUserService.addUser(uname, code);
    }

}
