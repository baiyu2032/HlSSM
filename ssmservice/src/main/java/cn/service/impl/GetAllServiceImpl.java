package cn.service.impl;

import cn.dao.UserJobDao;
import cn.pojo.UserJob;
import cn.service.GetAllService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("gasi")
public class GetAllServiceImpl implements GetAllService {

	@Autowired
	@Qualifier("user")
	private UserJobDao ujd;
	public UserJobDao getUjd() {
		return ujd;
	}
	public void setUjd(UserJobDao ujd) {
		this.ujd = ujd;
	}


	@Override
	public String getAll() {
		List<UserJob> allJob = ujd.getAllJob();
		return JSON.toJSONString(allJob);
	}
	
}
