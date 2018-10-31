package cn.dao;

import cn.pojo.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("gd")
public interface GoodsDao {
    List<Brand> getbrand();
}
