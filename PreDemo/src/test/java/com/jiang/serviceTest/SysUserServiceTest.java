package com.jiang.serviceTest;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jiang.pojo.SysUser;
import com.jiang.service.SysUserService;

@ContextConfiguration(locations = { "classpath:spring/spring-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)

public class SysUserServiceTest {

	@Autowired
	private SysUserService service;
	
	@Test
	public void test1() {
		SysUser user = new SysUser();
		user.setTelephone("15528088884");
		user.setUsername("jiangjianli");
		user.setPassworld("123456");
		user.setStatus(1);
		user.setOperateIp("127.0.0.1");
		user.setOperateTime(new Date());
		user.setOperator("jiang");
		this.service.addSysUser(user);
	}
	
	
	@Test
	public void test2() {
		
		SysUser user = this.service.findSysUserById(1);
		
		System.out.println(user.toString());
		
	}
	
}
