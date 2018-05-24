package com.jiang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiang.mapper.SysRoleMapper;
import com.jiang.pojo.SysRole;
import com.jiang.pojo.SysUser;
import com.jiang.pojo.SysRoleExample;
import com.jiang.pojo.SysRoleExample.Criteria;
import com.jiang.service.SysRoleService;

@Service
public class SysRoleServiceImpl implements SysRoleService {

	@Autowired
	private SysRoleMapper mapper;
	
	public void addRole(SysRole role) {
		// TODO Auto-generated method stub
        this.mapper.insert(role);
        
	}

	public SysRole findRoleById(int role_id) {
		// TODO Auto-generated method stub
		SysRoleExample example = new SysRoleExample();
		Criteria criteria =  example.createCriteria();
		criteria.andIdEqualTo(role_id);
		List<SysRole> users = this.mapper.selectByExample(example);
		
		if (users.size() > 0) {
			SysRole user = users.get(0);
			return user;
		}
		
		return null;
	}

}
