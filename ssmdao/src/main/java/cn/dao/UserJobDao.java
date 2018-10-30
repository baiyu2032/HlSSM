package cn.dao;

import cn.pojo.UserJob;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("user")
public interface UserJobDao {
	List<UserJob> getAllJob();
}
