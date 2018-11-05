package cn.controller;

import cn.service.ClassifiedDisplayService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
    @ApiOperation(value="获得品牌种类",httpMethod="POST",notes="返回具体品牌json数组")
    @RequestMapping(value = "getbrand")
    public String brand(){
        return cds.getbrand();
    }
    @ResponseBody
    @RequestMapping(value = "showcom")
    @ApiOperation(value="按照ID查询相应商品",httpMethod="POST",notes="返回商品对象的json数据")
    public String showcom(int id){
        return cds.computerShow(id);
    }

    @ResponseBody
    @RequestMapping(value = "findbyname" ,produces = "application/json;charset=utf-8")
    @ApiOperation(value="模糊查询",httpMethod="POST",notes="返回查到的商品信息json数组")
    public String findByComname(String s){
//        SensitiveWordFilterConfig swfc=new SensitiveWordFilterConfig();
//        String s1 = swfc.filterInfo(s);
        return cds.findByComname(s);
    }
    @ResponseBody
    @RequestMapping(value = "getallbrand")
    @ApiOperation(value="查询所有品牌种类",httpMethod="POST",notes="返回所有品种json数组")
    public String getallbrand(){
        return cds.getallbrand();
    }

    @ResponseBody
    @RequestMapping("getallgoods")
    @ApiOperation(value = "分页查询所有商品",httpMethod = "POST",notes = "返回每页的商品")
    public String getallgoods(@RequestParam("index")int index, @RequestParam("page")int page){
        return cds.getallgoods(index,page);
    }
}
