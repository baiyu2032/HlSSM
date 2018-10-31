package cn.dao;

import cn.pojo.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("gd")
public interface GoodsDao {
    /**
     * 显示全部电脑种类
     * @return
     */
    List<Brand> getbrand();
}
