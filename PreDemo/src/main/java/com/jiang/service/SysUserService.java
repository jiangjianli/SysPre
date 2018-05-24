package com.jiang.service;

import com.jiang.pojo.SysUser;

public interface SysUserService {

	
	void addSysUser(SysUser user);
	
	SysUser findSysUserById(int user_id);
	
}
