package com.wqc.ssm.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wqc.ssm.pojo.User;
import com.wqc.ssm.service.UserService;

/**  
* @ClassName UserController  
* @Description: 
* @author wangqiancheng 
* @date 2018年1月8日 下午3:19:02  
*/  

@Controller
//@RequestMapping("user")
public class UserController {
	
	private static Logger logger = Logger.getLogger(UserController.class); 
	
	@Resource  
    private UserService userService;  

    @RequestMapping("/")    
    public ModelAndView getIndex(){      
        ModelAndView mav = new ModelAndView("index");   
        User user = userService.selectUserById(1);  
        mav.addObject("user", user);   
        return mav;    
    }    
    
    @RequestMapping("/log")    
    public ModelAndView getIndex1(){     
        // 记录debug级别的信息    
        logger.debug("This is debug message.");    
        // 记录info级别的信息    
        logger.info("This is info message.");    
        // 记录error级别的信息    
        logger.error("This is error message.");   

        ModelAndView mav = new ModelAndView("index");   
        return mav;    
    }    
}
