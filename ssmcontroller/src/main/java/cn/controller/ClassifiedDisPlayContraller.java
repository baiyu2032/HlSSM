package cn.controller;

import cn.service.ClassifiedDisplayService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiImplicitParam;
import com.wordnik.swagger.annotations.ApiImplicitParams;
import com.wordnik.swagger.annotations.ApiOperation;
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
    @ApiImplicitParam(name = "id",value = "电脑商品ID",dataType = "Integer",paramType = "path",required = true)
    public String showcom(int id){
        return cds.computerShow(id);
    }

    @ResponseBody
    @RequestMapping(value = "findbyname" ,produces = "application/json;charset=utf-8")
    @ApiOperation(value="模糊查询",httpMethod="POST",notes="返回查到的商品信息json数组", response =String.class)
    @ApiImplicitParam(name = "s",value = "电脑名称",dataType = "String",paramType = "path",required = true)
    public String findByComname(String s){
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
    @ApiImplicitParams({
            @ApiImplicitParam(name = "index",value = "当前页码",paramType = "path",dataType = "Integer",required = true),
            @ApiImplicitParam(name = "uid",value = "每页条数",paramType = "path",dataType = "Integer",required = true)
    })
    public String getallgoods(@RequestParam("index")int index, @RequestParam("page")int page){
        return cds.getallgoods(index,page);
    }

    @RequestMapping("getgoodsbyid")
    @ResponseBody
    @ApiOperation(value = "根据ID查询相应商品",httpMethod = "POST",notes = "返回相应商品对象", response =String.class)
    @ApiImplicitParam(name = "gid",value = "电脑ID",dataType = "Integer",paramType = "path",required = true)
    public String getgoodsbyid(@RequestParam("gid")int gid){
        return cds.getgoodsbyid(gid);
    }
}
