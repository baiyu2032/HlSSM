package cn.service;

import cn.pojo.User;

/**
 * ��������: <br>
 * ���û���½ģ�页
 *
 * @return:
 * @since: 1.0.0
 * @Author:13654
 * @Date: 2018/11/4 21:47
 */
public interface LoginUserService {

    /**
     * ��������: <br>
     * ������codeʵ���û���¼��
     *
     * @param code
     * @return:
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/4 22:02
     */
    String logUser(String code);

    /**
     * ��������: <br>
     * ���û�ע�ᡵ
     *
     * @return:
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/4 21:50
     */
    String addUser(String uname ,String code);

}
