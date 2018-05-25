package com.jiang.serviceTest;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jiang.pojo.SysDept;
import com.jiang.pojo.SysDeptDto;
import com.jiang.service.SysDeptService;

@ContextConfiguration(locations = { "classpath:spring/spring-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)

public class SysDeptServiceTest {

	@Autowired
	SysDeptService depservice;
	
	@Test
	public void test1() {
		SysDept moden = new SysDept();
		moden.setName("jiang");
		moden.setSeq(1);
		System.out.println(depservice);
		depservice.saveDept(moden);
		
	} 
	
	
	@Test
	public void test2() {
		List<SysDept> list = this.depservice.getAllDepts();
		System.out.println(list.size());
	}
	
	
	@Test
	public void test3() {
		List<SysDeptDto> list = this.depservice.createThree();
		System.out.println(list);
	}
	
	@Test
	public void test4() {
		
		 SysDeptDto moden = this.depservice.findDeptById(12);
		 moden.setOperateTime(new Date());
		 moden.setParentId(2);
		 moden.setName("ssss");
		 moden.setSeq(1);
		 this.depservice.updateDept(moden);
		//System.out.println(list);
	}
	
	
	@Test
	public void test5() {
		List<SysDeptDto> list = this.depservice.createThreeethond2();
		System.out.println(list);
	}
	
}
