package com.yc.model.user.controller;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.constant.ConstantData;
import com.yc.dto.ApiDataModel;
import com.yc.dto.ResultDO;

import com.yc.model.user.service.UserService;
import com.yc.utils.FastJsonUtils;

@Controller
@RequestMapping("/userApi/Handler")
public class UserController {
	private static Logger logger = LoggerFactory.getLogger(UserController.class); 
	@Autowired 
    private UserService userService ;
	@RequestMapping(value ="/userlogin",method = {RequestMethod.POST})
	 @ResponseBody
	public ResultDO<String> userlogin(@RequestParam("data") String data){
		
		
	
		return new ResultDO<String>();
	}
	
	@RequestMapping(value ="/userRegister",method = {RequestMethod.POST})
	 @ResponseBody
	public ResultDO<String> userrRegister(@RequestParam("data") String data){
	
		return new ResultDO<String>();
	}
//	/**
//	 * 用户登录
//	 * @param api
//	 * @return ResultModel
//	 */
//	private ResultDO<String> userlogin(String data){
//		ResultModel apimModel=new ResultModel();
//		try {
//			UserModel user=FastJsonUtils.toBean(data, UserModel.class);
//			user=userService.selectByNameOrPsw(user.getNickname(), user.getPassword());
//			if (null!=user) {
//				apimModel.setCode(ConstantData.SUCCESS_CODE);
//				apimModel.setData(FastJsonUtils.toJSONString(user));
//			}else{
//				apimModel.setCode(ConstantData.USERLOGIN_ERR_CODE);
//				apimModel.setMessage(ConstantData.USERLOGIN_ERR_MSG);
//			}
//		} catch (Exception e) {
//			apimModel.setCode(ConstantData.SYSTEM_ERR_CODE);
//			apimModel.setMessage(ConstantData.SYSTEM_ERR_MSG);
//		}
//		return apimModel;
//	}
//	/**
//	 * 用户注册
//	 * @param api
//	 * @return ResultModel
//	 */
//	private ResultDO<String> userrRegister(String data){
//		ResultModel apimModel=new ResultModel();
//		try {
//			UserModel user = analysisData(data); 
//			if (StringUtils.isEmpty(user.getPhonenumber())) {//手机号不能为空
//				apimModel.setCode(ConstantData.PHONENUMBER_ERR_CODE);
//				apimModel.setMessage(ConstantData.PHONENUMBER_ERR_MSG);
//			}else if (StringUtils.isEmpty(user.getPassword())) {//密码不能为空
//				apimModel.setCode(ConstantData.PASSWORD_ERR_CODE);
//				apimModel.setMessage(ConstantData.PASSWORD_ERR_MSG);
//			}else {
//				 int inser= userService.insert(user);
//					if (inser!=0) {	
//						apimModel.setCode(ConstantData.SUCCESS_CODE);
//						apimModel.setData(user.getUserid());
//					}else{
//						apimModel.setCode(ConstantData.REGISTER_ERR_CODE);
//						apimModel.setMessage(ConstantData.REGISTER_ERR_MSG);
//					}
//			}
//	       
//		} catch (Exception e) {
//			apimModel.setCode(ConstantData.SYSTEM_ERR_CODE);
//			apimModel.setData(ConstantData.SYSTEM_ERR_MSG);
//			e.printStackTrace();
//		}
//		
//		return apimModel;
//	}
//	/**
//	 * 解析数据
//	 * @param data
//	 * @return
//	 */
//	private UserModel analysisData(String data) {
//		@SuppressWarnings("unchecked")
//		Map<String, String> map=FastJsonUtils.stringToCollect(data);
//		String appInfo=map.get("appinfo");
//		String userid=checkAppinfo(appInfo);
//		if (!StringUtils.isEmpty(userid)) {
//			String dataParam=map.get("userinfo");
//		UserModel user=FastJsonUtils.toBean(dataParam, UserModel.class);
//		user.setUserid(userid);
//		  //获取当前注册时间  
//        Date date = new Date();  
//        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
//        user.setStarttime( df.format(date));  
//		return user;
//	}
//		return null;
//}
//	private String checkAppinfo(String appInfo) {
//		DeviceModel device=FastJsonUtils.toBean(appInfo,DeviceModel.class);
//		  //获取当前注册时间  
//        Date date = new Date();  
//        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
//        device.setJoindate( df.format(date));  
//	//生成唯一识别码  
//	 String s = UUID.randomUUID().toString();
//	 	s +=device.getDeviceid();
//	 String user_code =  s.substring(0,8)+s.substring(9,13)+s.substring(14,18)+s.substring(19,24)+s.substring(25,32);   
//	 device.setUserid(user_code);
//	 int code=userService.insertDevice(device);
//	if (code!=0) {
//		return user_code;	
//	}else{
//		return null;	
//	}
//		
//	}
}
