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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("log/")
@Controller
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
    @RequestMapping(value = "code")
    public String login(@RequestParam("code") String code) {
        String loginfo = loginUserService.logUser(code);
        return loginfo;
    }
}
