package cn.dao;

import cn.pojo.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("bd")
public interface BrandDao {
    /**
     * 所有电脑品牌集合
     * @return
     */
    List<Brand> getallbrand();
}
