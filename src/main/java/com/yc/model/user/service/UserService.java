package com.yc.model.user.service;


import com.yc.model.user.bean.DeviceBean;
import com.yc.model.user.bean.UserBean;

public interface UserService {

	int insert(UserBean user);

	int insertDevice(DeviceBean device);

	int updataDevice(DeviceBean device);

	DeviceBean selectDevice(String userid);

	UserBean selectByNameOrPsw(String username, String userpsw);
}
