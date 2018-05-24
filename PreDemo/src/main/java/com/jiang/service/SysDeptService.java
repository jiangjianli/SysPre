package com.jiang.service;

import java.util.List;

import com.jiang.pojo.SysDept;
import com.jiang.pojo.SysDeptDto;

public interface SysDeptService {

	
	void saveDept(SysDept moden);
	
	void updateDept(SysDeptDto moden);
	
	SysDeptDto findDeptById(int dept_id);
	
	List<SysDept> getAllDepts();
	
	List<SysDeptDto> createThree();
	
	List<SysDeptDto> createThreeethond2();
}
