package cn.dao;

import cn.pojo.Address;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * ��������: <br>
 * ����ַ��
 * @since: 1.0.0
 * @Author:13654
 * @Date: 2018/11/1 10:07
 */
@Repository("local")
public interface AddressDao {

    /**
     * ��������: <br>
     * �����ӵ�ַ��
     *
     * @param address
     * @return:int
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/1 14:08
     */
    int addlocal(Address address);


    /**
     * ��������: <br>
     * ���޸ĵ�ַ��
     *
     * @param address
     * @return:
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/1 14:10
     */
    int updatelocal(Address address);

    /**
     * ��������: <br>
     * ��ɾ����ַ��
     *
     * @param uid
     * @return:
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/1 14:25
     */
    int dellocal(@Param("uid") int uid);

    /**
     * ��������: <br>
     * ����ѯ�û��ĵ�ַ������
     *
     * @param uid
     * @return:
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/1 14:25
     */
    int localcount(@Param("uid") int uid);

}
