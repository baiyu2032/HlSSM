package cn.dao;

import cn.pojo.Brand;
import cn.pojo.Goods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("gd")
public interface GoodsDao {
    /**
     * 显示全部电脑种类
     * @return
     */
    List<Brand> getbrand();

    /**
     * 根据ID查找所在的电脑信息
     * @param gbra
     * @return
     */
    List<Goods> corres(@Param("gbra") int gbra);
}


