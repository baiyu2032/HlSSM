package cn.controller;

import cn.pojo.UserJob;
import cn.service.GetAllService;
import com.alibaba.fastjson.JSON;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("test/")
@Api(value="测试")
@Controller
public class GetAllController {
	
	@Autowired
	private GetAllService gas;
	public GetAllService getGas() {
		return gas;
	}
	public void setGas(GetAllService gas) {
		this.gas = gas;
	}


	@ResponseBody
	@RequestMapping(value="getall")
    @ApiOperation(value = "查询全部")
	public String adslkf(){
		System.out.println("1");
		return gas.getAll();
	}
	@ResponseBody
	@RequestMapping(value="setjson")
	public String adslk(@RequestBody UserJob uj){
		System.out.println(1);
		System.out.println(uj.getJname() + "---" + uj.getJid());
		String s = JSON.toJSONString(uj);
		return s;
	}
}
