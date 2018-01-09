package com.wqc.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wqc.ssm.pojo.User;

/**  
* @ClassName UserDao  
* @Description: 
* @author wangqiancheng 
* @date 2018年1月8日 下午2:33:06  
*/  
public interface UserDao {

	 /**
     * @param userId
     * @return User
     */
    public User selectUserById(Integer userId);  
    
    /**
     * @param userName
     * @return
     */
    List<User> selectUserByUserName(@Param("userName") String userName);  
}
