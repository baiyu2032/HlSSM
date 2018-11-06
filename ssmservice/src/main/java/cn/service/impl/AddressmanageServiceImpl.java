/**
 * Copyright (C), 2015-2018, XXX���޹�˾
 * FileName: AddressmanageServiceImpl
 * Author:   13654
 * Date:     2018/11/1 16:48
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * ��������           �޸�ʱ��           �汾��              ����
 */
package cn.service.impl;


import cn.dao.AddressDao;
import cn.pojo.Address;
import cn.service.AddressmanageService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import util.VerifyUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("localser")
public class AddressmanageServiceImpl implements AddressmanageService {

    @Autowired
    @Qualifier("local")
    private AddressDao addressDao;

    public AddressDao getAddressDao() {
        return this.addressDao;
    }

    public void setAddressDao(AddressDao addressDao) {
        this.addressDao = addressDao;
    }

    @Autowired
    @Qualifier("util")
    private VerifyUtil util;

    public VerifyUtil getUtil() {
        return this.util;
    }
    public void setUtil(VerifyUtil util) {
        this.util = util;
    }

    /**
     * ��������: <br>
     * ����ӵ�ַ��
     *
     * @param address
     * @return:
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/1 20:40
     */
    @Override
    public String addLocal(Address address) {
        Map<String,Object> map = new HashMap<String, Object>();
        String retinfo=null;
        String na = address.getAname();
        String loc = address.getLocal();
        String pho = address.getPhone();
        String post = address.getPostcode();
        Integer uid = address.getUid();
        if (util.name(na)==null&&util.Phone(pho)==null&&util.address(loc)==null&&util.postcode(post)==null) {
            if (addressDao.localCount(uid)>=3){
                map.put("code","1");
                map.put("errmsg","��ַ��Ӵﵽ���ޣ���ɾ����ַ�����ԣ�");
                return JSON.toJSONString(map);
            }
            if(addressDao.localCount(uid)==0){
                address.setAdefault(1);
            }else{
                address.setAdefault(0);
            }
            int addlocal = addressDao.addLocal(address);
            if(addlocal != 0){
                map.put("code","0");
                map.put("errmsg","��ӳɹ�");
            }else{
                map.put("code","1");
                map.put("errmsg","���ʧ��");
            }
        }else{
            map.put("code","1");
            map.put("errmsg","���ʧ�ܸ�ʽ����");
        }
        return JSON.toJSONString(map);
    }


    @Override
    public String updateLocal(Address address) {
        String retinfo = null;
        Map<String,Object> map = new HashMap<String, Object>();
        String na = address.getAname();
        String loc = address.getLocal();
        String pho = address.getPhone();
        String post = address.getPostcode();
        if (util.name(na)==null&&util.Phone(pho)==null&&util.address(loc)==null&&util.postcode(post)==null) {
            int fleg = addressDao.updateLocal(address);
            if (fleg!=0){
                map.put("code","0");
                map.put("errmsg","�޸ĳɹ�");

            }else{
                map.put("code","1");
                map.put("errmsg","�޸�ʧ��");
            }
        }else{
            map.put("code","1");
            map.put("errmsg","�޸�ʧ�ܸ�ʽ����");
        }
        return JSON.toJSONString(map);
    }

    @Override
    public String delLocal(int uid,int aid) {
        String retinfo = null;
        if(addressDao.localCount(uid)==0){
            return "���û�û�е�ַ�޷�ɾ��������ӵ�ַ";
        }else{
            int fleg = addressDao.delLocal(uid, aid);
            if (fleg!=0){
                retinfo="ɾ���ɹ���";
            }else{
                retinfo="ɾ��ʧ�ܣ�";
            }
        }

        return retinfo;
    }

    @Override
        public String selLocal(int uid) {
        List<Address> list = null;
        Map<String,Object> map = new HashMap<String, Object>();
        list=addressDao.selectlocal(uid);
        if (list != null&&!list.isEmpty()){
            map.put("errmsg","���ҳɹ�");
            map.put("data",list);
        }else{
            map.put("errmsg","��ǰû�е�ַ�����");
        }

        return  JSON.toJSONString(map) ;
    }

    @Override
    public String selLoncalinfo(int aid, int uid) {
        Map<String,Object> map = new HashMap<String, Object>();
        Address address = addressDao.selLocal(aid, uid);
        if (address != null){
            map.put("code","0");
            map.put("errmsg","���ҳɹ�");
            map.put("data",address);
        }else{
            map.put("errmsg","��ǰû�е�ַ�����");
            map.put("code","1");
        }
        return  JSON.toJSONString(map);
    }
}
