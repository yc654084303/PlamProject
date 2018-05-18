package com.yc.model.user.bean;

import java.io.Serializable;
import java.util.Date;


public class UserBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private long id;
	private String userId;
	private String nickName;
	private String passWord;
	private String mobile;
	private String userHeaderUrl;
	private String uuniId;
	private String userType;//0普通1、会员，2管理员，3预留
	private int status;//用户状态-1,封禁0正常1预留
	private int loginType;//0手机1微信2qq
	private Date regTime;//注册时间
	private Date updateTime;//更新时间
	private DeviceBean deviceBean;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getUserHeaderUrl() {
		return userHeaderUrl;
	}
	public void setUserHeaderUrl(String userHeaderUrl) {
		this.userHeaderUrl = userHeaderUrl;
	}
	public String getUuniId() {
		return uuniId;
	}
	public void setUuniId(String uuniId) {
		this.uuniId = uuniId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	public int getLoginType() {
		return loginType;
	}
	public void setLoginType(int loginType) {
		this.loginType = loginType;
	}
	public Date getRegTime() {
		return regTime;
	}
	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public DeviceBean getDeviceBean() {
		return deviceBean;
	}
	public void setDeviceBean(DeviceBean deviceBean) {
		this.deviceBean = deviceBean;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
