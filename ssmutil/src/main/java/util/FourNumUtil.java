package util;

import cn.pojo.User;
import org.springframework.stereotype.Component;

import java.util.Random;
@Component("fnu")
public class FourNumUtil {
    /**
     * 随机四位数字
     * @return  生成账号
     */
    public String CreateAccount() {
        Random random = new Random();
        User us = new User();
        int account = 0;
            do {
                //随机生成5位以内随机数
           account = random.nextInt(10000);
                //生成随机数不能少于4位
            }while (account < 1000);
            String num = Integer.toString(account);
            return num;
    }
}
