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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import sun.util.resources.CurrencyNames_en_MT;
import util.VerifyUtil;

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
    public String Addlocal(Address address) {
        String retinfo=null;
        Address add = new Address();
        String na = address.getAname();
        String loc = address.getLocal();
        String pho = address.getPhone();
        String post = address.getPostcode();
        Integer uid = address.getUid();
        if (util.name(na)==null&&util.Phone(pho)==null&&util.address(loc)==null&&util.postcode(post)==null) {
            if (addressDao.localcount(uid)>=3){
                return "��ַ��Ӵﵽ���ޣ���ɾ����ַ�����ԣ�";
            }
            add.setAname(na);
            add.setPhone(pho);
            add.setLocal(loc);
            add.setPostcode(post);
            add.setUid(uid);
            if(addressDao.localcount(uid)==0){
                add.setAdefault(1);
            }else{
                add.setAdefault(0);
            }
            int addlocal = addressDao.addlocal(add);
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
}
