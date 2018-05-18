package com.yc.constant;

import java.io.UnsupportedEncodingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yc.utils.DESUtil;

public class ConstantData {
	private static Logger logger = LoggerFactory.getLogger(ConstantData.class); 

	public static final int SUCCESS_CODE=0;
public final static String CLASS_PKGPATH="com.yc.service.";
public static final int SYSTEM_ERR_CODE=-99999;
public static final String SYSTEM_ERR_MSG="未知异常";
public static final int USERLOGIN_ERR_CODE=-4;
public static final String USERLOGIN_ERR_MSG="用户不存在";
public static final int NODTA_ERR_CODE=-5;
public static final String NODTA_ERR_MSG="数据不能为空";
public static final int REGISTER_ERR_CODE=-3;
public static final String REGISTER_ERR_MSG="注册失败";
public static final int PASSWORD_ERR_CODE=-6;
public static final String PASSWORD_ERR_MSG="密码不能为空";
public static final int PHONENUMBER_ERR_CODE=-7;
public static final String PHONENUMBER_ERR_MSG="密码不能为空";
public static final int KEYWORD_err_code=-8;
public static final String KEYWORD_ERR_MSG="密钥异常，请检查加密情况";
public static String  DESJsonData(String data) throws UnsupportedEncodingException {
	DESUtil desUtil=new DESUtil();
	String desDataStr=desUtil.decrypt(data);
	logger.info("data:"+desDataStr);
	return desDataStr;
}
}
