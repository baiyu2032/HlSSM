/**
 * Copyright (C), 2015-2018, XXX���޹�˾
 * FileName: Address
 * Author:   13654
 * Date:     2018/11/1 11:30
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * ��������           �޸�ʱ��           �汾��              ����
 */
package cn.pojo;

/**
 * ��������: <br>
 * ����
 *
 * @param��ַʵ����
 * @since: 1.0.0
 * @Author:13654
 * @Date: 2018/11/1 11:33
 */
public class Address {
    /**
     *��ַid
     */
    private Integer aid;
    /**
     *��ϵ��
     */
    private String aname;
    /**
     *�ֻ���
     */
    private String phone;
    /**
     *��������
     */
    private Integer postcode;
    /**
     *��ַ
     */
    private String local;
    /**
     *�û�id
     */
    private Integer uid;


    public Integer getAid() {
        return this.aid;
    }


    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return this.aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getPostcode() {
        return this.postcode;
    }

    public void setPostcode(Integer postcode) {
        this.postcode = postcode;
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Integer getUid() {
        return this.uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
