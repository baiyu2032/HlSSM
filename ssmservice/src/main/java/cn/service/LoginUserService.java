package cn.service;

import cn.pojo.User;

/**
 * 功能描述: <br>
 * 〈用户登陆模块〉
 *
 * @return:
 * @since: 1.0.0
 * @Author:13654
 * @Date: 2018/11/4 21:47
 */
public interface LoginUserService {

    /**
     * 功能描述: <br>
     * 〈根据code实现用户登录〉
     *
     * @param code
     * @return:
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/4 22:02
     */
    String logUser(String code);

    /**
     * 功能描述: <br>
     * 〈用户注册〉
     *
     * @return:
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/4 21:50
     */
    String addUser(String uname ,String code);

}
