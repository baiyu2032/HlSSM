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

    /**
     * 对于商品名称进行模糊查询
     * @param gname 商品名称关键字
     * @return
     */
    List<Goods> findByName(@Param("gname") String gname);

    /**
     * 获取总记录数
     * @return
     */
    int getcount();
    /**
     * 分页显示所有电脑商品
     * @return
     */
    List<Goods> getallgoods(@Param("index") int index, @Param("pagesize") int pagesize);

    /**
     * 根据商品ID查询对应电脑
     * @param gid  商品ID
     * @return   电脑对象
     */
    Goods getgoodsbyid(@Param("gid") int gid);
}


