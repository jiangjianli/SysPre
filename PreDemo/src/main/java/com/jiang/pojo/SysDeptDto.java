package com.jiang.pojo;

import java.util.List;

public class SysDeptDto extends SysDept {

	
	private List<SysDeptDto> child ;

	public List<SysDeptDto> getChild() {
		return child;
	}

	public void setChild(List<SysDeptDto> child) {
		this.child = child;
	}
	
	
}
