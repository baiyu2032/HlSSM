package util;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
@Component("dt")
public class DateUtil {
    /**
     * 获取当前时间
     * @return  年月日时分秒
     */
    public String selDate(){
        DateUtil currentTime = new DateUtil();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        return dateString;
    }
}
