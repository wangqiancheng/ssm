package com.wqc.ssm.service;

import com.github.pagehelper.PageInfo;
import com.wqc.ssm.pojo.User;

/**  
* @ClassName UserService  
* @Description: 
* @author wangqiancheng 
* @date 2018年1月8日 下午2:32:45  
*/  
public interface UserService {

	User selectUserById(Integer userId);
	
	/**
	 * @param userName
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	PageInfo<User> queryByPage(String userName,Integer pageNo,Integer pageSize);
}
