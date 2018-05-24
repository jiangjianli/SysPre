package com.jiang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiang.common.JsonData;
import com.jiang.pojo.SysDeptDto;
import com.jiang.service.SysDeptService;





@Controller

public class TestController {

	@Autowired
	private SysDeptService deptservice;
	
	@RequestMapping("/hello")
	@ResponseBody
	public JsonData test() {
	
		System.out.println("hello");
		return JsonData.success(1, "jiang", "jianli");
	}
	
	@RequestMapping("/depttree")
	@ResponseBody
	public JsonData test1() {
		List<SysDeptDto> list = this.deptservice.createThree();
		System.out.println("hello");
		return JsonData.success(1, "jiang", list);
	}
	
	
	@RequestMapping("/depttree1")
	@ResponseBody
	public JsonData test2() {
		List<SysDeptDto> list = this.deptservice.createThreeethond2();
		System.out.println("hello");
		return JsonData.success(1, "jiang", list);
	}
}
