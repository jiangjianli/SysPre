package com.jiang.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiang.mapper.SysDeptMapper;

import com.jiang.pojo.SysDept;
import com.jiang.pojo.SysDeptDto;
import com.jiang.pojo.SysDeptExample;
import com.jiang.pojo.SysDeptExample.Criteria;
import com.jiang.service.SysDeptService;
import com.jiang.common.LevelUntil;

@Service
public class SysDeptServiceImpl implements SysDeptService {

	@Autowired
	private SysDeptMapper mapper;
	
	
	
	public void saveDept(SysDept moden) {
		// TODO Auto-generated method stub
		//smoden.setParentId(2);
		String level  = LevelUntil.caculateLevel(getLevel(moden.getParentId()),moden.getParentId());
		moden.setLevel(level);
		moden.setOperator("jiang");
		moden.setOperateTime(new Date());
		moden.setOperateIp("127.0.0.1");
		
		this.mapper.insertSelective(moden);
	}

	 String getLevel(int depid)
	{
		SysDept moden = this.mapper.selectByPrimaryKey(depid);
		if (moden == null) {
			return null;
		}else {
			return moden.getLevel();
		}
	}

	public List<SysDept> getAllDepts() {
		// TODO Auto-generated method stub
		 SysDeptExample example = new SysDeptExample();
		 Criteria criteria = example.createCriteria();
		 criteria.getAllCriteria();
		 List<SysDept> list =  this.mapper.selectByExample(example);
		
		 return list;
	}
	
	List<SysDeptDto> getDto(List<SysDept> list)
	{
		List<SysDeptDto> list2 = new ArrayList<SysDeptDto>();
		 for (SysDept sysDept : list) {
			 SysDeptDto dto = new SysDeptDto();
			 BeanUtils.copyProperties(sysDept, dto);
			 list2.add(dto);
		}
		 return list2;
	}
	
	public  List<SysDeptDto> createThree()
	{
		 
		 List<SysDept> list2 = getAllDepts();
		 List<SysDeptDto> list3 = getDto(list2);
		 
		 List<SysDeptDto> first = new ArrayList<SysDeptDto>();
		 
		 Map<String, List<SysDeptDto>> map = new HashMap<String, List<SysDeptDto>>();
		 
		 
		 for (SysDeptDto sysDeptDto : list3) {
			 
			if (sysDeptDto.getLevel().equals("0")) {
				first.add(sysDeptDto);
			}
			List<SysDeptDto> l = map.get(sysDeptDto.getLevel());
			if (l == null) {
				l = new ArrayList<SysDeptDto>();
			}
			l.add(sysDeptDto);
			map.put(sysDeptDto.getLevel(), l);
		}
		 
		gettrefromRoot(first, null, map);
		
		return first;
	}
	
	void gettrefromRoot(List<SysDeptDto> list ,String level,Map<String, List<SysDeptDto>> map)
	{
		for (int i = 0; i < list.size(); i++) {
			SysDeptDto sysDeptDto = list.get(i);
		 //取得下一级Level
		 String nextleve = LevelUntil.caculateLevel(level, sysDeptDto.getId());
		 List<SysDeptDto> list2 = map.get(nextleve);
		 if (list2 == null) {
			 sysDeptDto.setChild(new ArrayList<SysDeptDto>());
		}else
		{
		 sysDeptDto.setChild(list2);
		 gettrefromRoot(list2, nextleve, map);
		}
		 
		 
		}
	
		
	}
	
}
