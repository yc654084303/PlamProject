package com.yc.model.user.dao;


import com.yc.model.user.bean.DeviceBean;
import com.yc.model.user.bean.UserBean;

public interface UserDao {  
//	  int deleteByPrimaryKey(String userid);
	    int insertPasswordOrphoneunber(UserBean user);
	    UserBean selectByNameOrPsw(String mobile,String passWord);
	    int insertDevice(DeviceBean device);
		 int updataDevice(DeviceBean device);
		 DeviceBean selectDevice(String userid);
      
}  
