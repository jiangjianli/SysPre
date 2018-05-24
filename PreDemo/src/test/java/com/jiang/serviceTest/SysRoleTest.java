package com.jiang.serviceTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jiang.pojo.SysRole;
import com.jiang.service.SysRoleService;

@ContextConfiguration(locations = { "classpath:spring/spring-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)

public class SysRoleTest {

	@Autowired
	private  SysRoleService service;
	
	@Test
	public void test1() {
		SysRole role = new SysRole();
		role.setName("test");
		
		this.service.addRole(role);
	}
	
	@Test
	public void test2() {
	
		SysRole role = this.service.findRoleById(1);
		System.out.println(role.toString());
		
		
	}
	
}
