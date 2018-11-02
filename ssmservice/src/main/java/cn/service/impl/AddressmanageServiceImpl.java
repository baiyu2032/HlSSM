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
        String retinfo=null;
        String na = address.getAname();
        String loc = address.getLocal();
        String pho = address.getPhone();
        String post = address.getPostcode();
        Integer uid = address.getUid();
        if (util.name(na)==null&&util.Phone(pho)==null&&util.address(loc)==null&&util.postcode(post)==null) {
            if (addressDao.localCount(uid)>=3){
                return "��ַ��Ӵﵽ���ޣ���ɾ����ַ�����ԣ�";
            }
            if(addressDao.localCount(uid)==0){
                address.setAdefault(1);
            }else{
                address.setAdefault(0);
            }
            int addlocal = addressDao.addLocal(address);
            if(addlocal != 0){
                retinfo = "���ӳɹ���";
            }else{
                retinfo = "����ʧ��!";
            }
        }else{
            return "��Ϣ��ʽ��������������";
        }
        return retinfo;
    }


    @Override
    public String updateLocal(Address address) {
        String retinfo = null;
        String na = address.getAname();
        String loc = address.getLocal();
        String pho = address.getPhone();
        String post = address.getPostcode();
        if (na!=null){
            String name = util.name(na);
            if (name!=null){
                return name;
            }
        }
        if (loc!=null){
            String addres= util.address(loc);
            if (addres!=null){
                return addres;
            }
        }
        if (pho!=null){
            String phone = util.Phone(pho);
            if (phone!=null){
                return phone;
            }
        }
        if (post!=null){
            String postcode = util.postcode(post);
            if (post!=null){
                return postcode;
            }
        }
        int fleg = addressDao.updateLocal(address);
        if (fleg!=0){
            retinfo="�޸ĳɹ�";
        }else{
            retinfo="�޸�ʧ��";
        }
        return retinfo;
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
        Map<String,String> map = new HashMap<String, String>();
        list=addressDao.selectlocal(uid);
        if (list != null){
            map.put("errmsg","���ҳɹ�");
            map.put("data",JSON.toJSONString(list));
        }else{
            map.put("errmsg","����ʧ�ܵ�ǰû������");
        }
        return JSON.toJSONString(map);
    }
}
