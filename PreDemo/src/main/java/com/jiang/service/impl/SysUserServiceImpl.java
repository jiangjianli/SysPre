package com.jiang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jiang.mapper.SysUserMapper;
import com.jiang.pojo.SysUser;
import com.jiang.pojo.SysUserExample;
import com.jiang.pojo.SysUserExample.Criteria;
import com.jiang.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private SysUserMapper mapper;
	
	public void addSysUser(SysUser user) {
		// TODO Auto-generated method stub
		this.mapper.insert(user);
	}

	public SysUser findSysUserById(int user_id) {
		// TODO Auto-generated method stub
		
		SysUserExample example = new SysUserExample();
		Criteria criteria =  example.createCriteria();
		criteria.andIdEqualTo(user_id);
		List<SysUser> users = this.mapper.selectByExample(example);
		
		if (users.size() > 0) {
			SysUser user = users.get(0);
			return user;
		}
		
		return null;
	}
	

}
