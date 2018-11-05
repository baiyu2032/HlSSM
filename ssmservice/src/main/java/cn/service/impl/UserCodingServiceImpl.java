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
    /**
     * 生成订单码
     * @return
     */
    @Override
    public String usernum() {
        User u = new User();
        String usernum = null;
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd HHmmss");
        String dateString = formatter.format(currentTime);
        Boolean cout = true;
      do{
          if(fnu.CreateAccount() == null){
              cout = false;
          }
         usernum = fnu.CreateAccount();
      }while (cout);
        String usernums = dateString + usernum;
        u.setUsernum(usernums);
        return usernums;
    }


}
