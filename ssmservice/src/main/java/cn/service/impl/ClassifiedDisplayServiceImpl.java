package cn.service.impl;

import cn.dao.BrandDao;
import cn.dao.GoodsDao;
import cn.pojo.Brand;
import cn.pojo.Goods;
import cn.service.ClassifiedDisplayService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 分类展示种类信息
 */
@Repository("cdsi")
public class ClassifiedDisplayServiceImpl implements ClassifiedDisplayService {

    @Autowired
    @Qualifier("gd")
    private GoodsDao goodsDao;
    public GoodsDao getGoodsDao() { return this.goodsDao; }
    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    @Autowired
    @Qualifier("bd")
    private BrandDao brandDao;
    public BrandDao getBrandDao() {
        return this.brandDao;
    }
    public void setBrandDao(BrandDao brandDao) {
        this.brandDao = brandDao;
    }

    /**
     * 显示全部电脑种类
     * @return  电脑种类json数组
     */
    @Override
    public String getbrand() {
        List<Brand> brands=goodsDao.getbrand();
        String s = JSON.toJSONString(brands);
        return s;
    }
    /**
     * 对应电脑种类展示
     *
     * @param gbra 电脑类型ID
     * @return
     */
    @Override
    public String computerShow(int gbra) {
        List<Goods> corres = goodsDao.corres(gbra);

        String s = JSON.toJSONString(corres);
        return s;
    }

    @Override
    public String findByComname(String string) {
        List<Goods> byName = goodsDao.findByName(string);
        String s = JSON.toJSONString(byName);
        return s;
    }

    /**
     * 所有电脑品牌集合
     *
     * @return
     */
    @Override
    public String getallbrand() {
        List<Brand> getallbrand = brandDao.getallbrand();
        String s = JSON.toJSONString(getallbrand);
        return s;
    }
}
