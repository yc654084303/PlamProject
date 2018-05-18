package com.yc.model.user.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yc.model.user.bean.DeviceBean;
import com.yc.model.user.bean.UserBean;
import com.yc.model.user.dao.UserDao;
import com.yc.model.user.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	@Override
	public int insert(UserBean user) {
		return userDao.insertPasswordOrphoneunber(user);
	}

	@Override
	public UserBean selectByNameOrPsw(String username, String userpsw) {
		return userDao.selectByNameOrPsw(username, userpsw);
	}
	//事务处理
	@Transactional
	@Override
	public int insertDevice(DeviceBean device) {
		return userDao.insertDevice(device);
	}

	@Override
	public int updataDevice(DeviceBean device) {
		return userDao.updataDevice(device);
	}

	@Override
	public DeviceBean selectDevice(String userid) {
		return userDao.selectDevice(userid);
	}

}
