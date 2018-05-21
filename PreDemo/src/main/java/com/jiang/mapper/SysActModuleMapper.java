package com.jiang.mapper;

import com.jiang.pojo.SysActModule;
import com.jiang.pojo.SysActModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysActModuleMapper {
    int countByExample(SysActModuleExample example);

    int deleteByExample(SysActModuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysActModule record);

    int insertSelective(SysActModule record);

    List<SysActModule> selectByExample(SysActModuleExample example);

    SysActModule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysActModule record, @Param("example") SysActModuleExample example);

    int updateByExample(@Param("record") SysActModule record, @Param("example") SysActModuleExample example);

    int updateByPrimaryKeySelective(SysActModule record);

    int updateByPrimaryKey(SysActModule record);
}