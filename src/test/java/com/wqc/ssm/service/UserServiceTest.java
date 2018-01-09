package com.wqc.ssm.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageInfo;
import com.wqc.ssm.baseTest.SpringTestCase;
import com.wqc.ssm.pojo.User;


/**  
* @ClassName UserServiceTest  
* @Description: 
* @author wangqiancheng 
* @date 2018年1月8日 下午2:37:42  
*/  
public class UserServiceTest extends SpringTestCase {

	@Autowired  
    private UserService userService; 

    @Test  
    public void selectUserByIdTest(){  
        User user = userService.selectUserById(1);  
        System.out.println(user.getUserName() + ":" + user.getUserPassword());
    }  
    
    @Test  
    public void queryByPageTest(){  
        PageInfo<User> page =  userService.queryByPage(null, 1, 1);
        System.out.println(page);
    }
}
