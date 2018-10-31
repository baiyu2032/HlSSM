package cn.service.impl;

import cn.dao.GoodsDao;
import cn.pojo.Brand;
import cn.service.ClassifiedDisplayService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("cdsi")
public class ClassifiedDisplayServiceImpl implements ClassifiedDisplayService {
    @Autowired
    @Qualifier("gd")
    private GoodsDao goodsDao;
    public GoodsDao getGoodsDao() { return this.goodsDao; }
    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    @Override
    public String getbrand() {
        List<Brand> brands=goodsDao.getbrand();
        String s = JSON.toJSONString(brands);
        return s;
    }
}
