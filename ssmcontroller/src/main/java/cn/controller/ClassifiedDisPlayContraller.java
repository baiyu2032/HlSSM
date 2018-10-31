package cn.controller;

import cn.service.ClassifiedDisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("display")
@Controller
public class ClassifiedDisPlayContraller {
    @Autowired
    private ClassifiedDisplayService cds;
    public ClassifiedDisplayService getCds() { return this.cds; }
    public void setCds(ClassifiedDisplayService cds) {
        this.cds = cds;
    }
    @ResponseBody
    @RequestMapping(value = "getbrand")
    public String brand(){
        return cds.getbrand();
    }
}
