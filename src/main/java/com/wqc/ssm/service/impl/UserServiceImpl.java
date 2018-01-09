package com.wqc.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wqc.ssm.dao.UserDao;
import com.wqc.ssm.pojo.User;
import com.wqc.ssm.service.UserService;


/**  
* @ClassName UserServiceImpl  
* @Description: 
* @author wangqiancheng 
* @date 2018年1月8日 下午2:32:29  
*/  
@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired  
    private UserDao userDao;  

    public User selectUserById(Integer userId) {  
        return userDao.selectUserById(userId);  
    }  
    
    public PageInfo<User> queryByPage(String userName, Integer pageNo,Integer pageSize) {
        pageNo = pageNo == null?1:pageNo;
        pageSize = pageSize == null?10:pageSize;
        PageHelper.startPage(pageNo, pageSize);
        List<User> list = userDao.selectUserByUserName(userName);
        //用PageInfo对结果进行包装
        PageInfo<User> page = new PageInfo<User>(list);
        //测试PageInfo全部属性
        System.out.println(page.getPageNum());
        System.out.println(page.getPageSize());
        System.out.println(page.getStartRow());
        System.out.println(page.getEndRow());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getFirstPage());
        System.out.println(page.getLastPage());
        System.out.println(page.isHasPreviousPage());
        System.out.println(page.isHasNextPage());
        return page;
    }  
}
