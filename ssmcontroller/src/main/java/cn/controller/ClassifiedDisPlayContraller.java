package cn.controller;

import cn.service.ClassifiedDisplayService;
import com.wordnik.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@RequestMapping("display/")
@Controller
@Api(value = "页面展示",description = "具体描述")
public class ClassifiedDisPlayContraller {
    @Autowired
    private ClassifiedDisplayService cds;
    public ClassifiedDisplayService getCds() { return this.cds; }
    public void setCds(ClassifiedDisplayService cds) {
        this.cds = cds;
    }

    @ResponseBody
    @ApiOperation(value="获得品牌种类",httpMethod="POST",notes="返回具体品牌json数组", response =String.class)
    @RequestMapping(value = "getbrand")
    public String brand(){
        return cds.getbrand();
    }
    @ResponseBody
    @RequestMapping(value = "showcom" ,method = RequestMethod.GET)
    @ApiOperation(value="按照ID查询相应商品",httpMethod="POST",notes="返回商品对象的json数据", response =String.class)
    public String showcom(@ApiParam(name = "id",value = "电脑商品ID",required = true) int id){
        return cds.computerShow(id);
    }

    @ResponseBody
    @RequestMapping(value = "findbyname" ,produces = "application/json;charset=utf-8")
    @ApiOperation(value="模糊查询",httpMethod="POST",notes="返回查到的商品信息json数组", response =String.class)
    public String findByComname(@ApiParam(name = "s",value = "电脑名称",required = true) String s){
//        SensitiveWordFilterConfig swfc=new SensitiveWordFilterConfig();
//        String s1 = swfc.filterInfo(s);
        return cds.findByComname(s);
    }
    @ResponseBody
    @RequestMapping(value = "getallbrand")
    @ApiOperation(value="查询所有品牌种类",httpMethod="POST",notes="返回所有品种json数组", response =String.class)
    public String getallbrand(){
        return cds.getallbrand();
    }

    @ResponseBody
    @RequestMapping("getallgoods")
    @ApiOperation(value = "分页查询所有商品",httpMethod = "POST",notes = "返回每页的商品", response =String.class)
    public String getallgoods(@ApiParam(name = "index",value = "当前页码",required = true) @RequestParam("index")int index,@ApiParam(name = "uid",value = "每页条数",required = true) @RequestParam("page")int page){
        return cds.getallgoods(index,page);
    }

    @RequestMapping("getgoodsbyid")
    @ResponseBody
    @ApiOperation(value = "根据ID查询相应商品",httpMethod = "POST",notes = "返回相应商品对象", response =String.class)
    public String getgoodsbyid(@ApiParam(name = "gid",value = "电脑ID",required = true) @RequestParam("gid")int gid){
        return cds.getgoodsbyid(gid);
    }
}
