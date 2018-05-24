package com.jiang.service;

import com.jiang.pojo.SysRole;

public interface SysRoleService {

	void addRole(SysRole role);
	
	SysRole findRoleById(int role_id);
	
	
	
}
