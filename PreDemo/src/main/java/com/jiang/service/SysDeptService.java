package com.jiang.service;

import java.util.List;

import com.jiang.pojo.SysDept;
import com.jiang.pojo.SysDeptDto;

public interface SysDeptService {

	
	void saveDept(SysDept moden);
	
	void updateDept(SysDeptDto moden);
	
	List<SysDept> getAllDepts();
	
	List<SysDeptDto> createThree();
	
	List<SysDeptDto> createThreeethond2();
}
