package cn.service.impl;
import cn.dao.UserDao;
import cn.pojo.User;
import cn.service.UserCodingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import util.FourNumUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
@Service("ucs")
public class UserCodingServiceImpl implements UserCodingService {
    @Autowired
    @Qualifier("fnu")
    private FourNumUtil fnu;
    public FourNumUtil getFnu() {
        return fnu;
    }
    public void setFnu(FourNumUtil fnu) {
        this.fnu = fnu;
    }
    @Autowired
    @Qualifier("locUser")
    private UserDao ud;

    public UserDao getUd() {
        return ud;
    }
    public void setUd(UserDao ud) {
        this.ud = ud;
    }
    private User u;


    /**
     * 生成订单编码
     * @return 订单编码
     */
    @Override
    public String usernums(String uopenid){
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHsHmms");
        String dateString = formatter.format(currentTime);
        String usernums = dateString +  ud.selUserNums(uopenid);
        u.setUsernum(usernums);
        return usernums;
    }
}
