package com.wqc.ssm.log;

import org.apache.log4j.Logger;

/**  
* @ClassName LogTest  
* @Description: 
* @author wangqiancheng 
* @date 2018年1月8日 下午5:49:09  
*/  
public class LogTest {
	
	private static Logger logger = Logger.getLogger(LogTest.class);    

    public static void main(String[] args) {      
        // 记录debug级别的信息    
        logger.debug("This is debug message.");    
        // 记录info级别的信息    
        logger.info("This is info message.");    
        // 记录error级别的信息    
        logger.error("This is error message.");   
    }    
}
