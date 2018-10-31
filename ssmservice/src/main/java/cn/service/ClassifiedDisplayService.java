package cn.service;

/**
 * 分类展示信息
 * author: len
 */
public interface ClassifiedDisplayService {
    /**
     * 获得所有电脑种类
     * @return  电脑种类json数组
     */
    String getbrand();

    /**
     * 对应电脑种类展示
     * @param gbra  电脑类型ID
     * @return
     */
    String computerShow(int gbra);
}
