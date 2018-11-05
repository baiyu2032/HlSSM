/**
 * Copyright (C), 2015-2018, XXX���޹�˾
 * FileName: LoginUserService
 * Author:   13654
 * Date:     2018/11/4 22:29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * by          11.4         1.0              �ӿ�ʵ����
 */
package cn.service.impl;

import cn.dao.UserDao;
import cn.pojo.User;
import cn.service.LoginUserService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import util.FourNumUtil;
import util.GetOpenIdutil;

import java.util.HashMap;
import java.util.Map;

@Service("logUser")
public class LoginUserServiceImpl implements LoginUserService {


    @Autowired
    @Qualifier("idutil")
    private GetOpenIdutil getopenid;
    public GetOpenIdutil getGetopenid() {
        return this.getopenid;
    }
    public void setGetopenid(GetOpenIdutil getopenid) {
        this.getopenid = getopenid;
    }

    @Autowired
    @Qualifier("locUser")
    private UserDao userdao;
    public UserDao getUserdao() {
        return this.userdao;
    }
    public void setUserdao(UserDao userdao) {
        this.userdao = userdao;
    }

    @Autowired
    @Qualifier("fnu")
    private FourNumUtil fnu;
    public FourNumUtil getFnu() {
        return fnu;
    }
    public void setFnu(FourNumUtil fnu) {
        this.fnu = fnu;
    }

    @Override
    public String logUser(String code) {
        Map<String,Object> map = new HashMap<String, Object>();
        if (code != null){
            String openId = getopenid.GetOpenId(code);
            if (openId!=null){
                User selUser = userdao.selUser(openId);
                if (selUser!=null){
                    map.put("data",selUser.getUid());
                    map.put("errmsg","���ҳɹ�");
                    map.put("code","0");
                }else {
                    map.put("errmsg","û�и��û���ע�ᣡ");
                    map.put("code","1");
                }
            }else{
                map.put("errmsg","û�л�ȡ��openid�����³��ԣ�");
                map.put("code","1");
            }
        }else{
            map.put("errmsg","���Ȼ�ȡcode��");
            map.put("code","1");
        }
        return JSON.toJSONString(map);
    }

    @Override
    public String addUser(String uname, String code) {
        Map<String,Object> map = new HashMap<String, Object>();
        if (code!=null){
            String openId = getopenid.GetOpenId(code);
            if (openId!=null){
                User use = new User();
                use.setUopenid(openId);
                use.setUname(uname);
                boolean fle = true;
                String account=null;
                while (fle){
                    account = fnu.CreateAccount();
                    int num = userdao.selUserNum(account);
                    if (num==0){
                        fle=false;
                    }
                }
                use.setUsernum(account);
                int veriinfo= userdao.addUser(use);
                if (veriinfo!=0){
                    map.put("errmsg","ע��ɹ�");
                    map.put("code","0");
                }else {
                    map.put("errmsg","ע��ʧ�ܣ�");
                    map.put("code","1");
                }
            }else{
                map.put("errmsg","û�л�ȡ��openid�����³��ԣ�");
                map.put("code","1");
            }
        }else{
            map.put("errmsg","���Ȼ�ȡcode��");
            map.put("code","1");
        }
        return JSON.toJSONString(map);
    }


}
