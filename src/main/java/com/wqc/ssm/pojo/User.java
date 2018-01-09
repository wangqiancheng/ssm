package com.wqc.ssm.pojo;


/**  
* @ClassName User  
* @Description: 
* @author wangqiancheng 
* @date 2018年1月8日 下午2:32:55  
*/  
public class User {

    private Integer userId;  
    private String userName;  
    private String userPassword;  


    public Integer getUserId() {  
        return userId;  
    }  

    public void setUserId(Integer userId) {  
        this.userId = userId;  
    }  

    public String getUserName() {  
        return userName;  
    }  

    public void setUserName(String userName) {  
        this.userName = userName;  
    }  

    public String getUserPassword() {  
        return userPassword;  
    }  

    public void setUserPassword(String userPassword) {  
        this.userPassword = userPassword;  
    }  

}