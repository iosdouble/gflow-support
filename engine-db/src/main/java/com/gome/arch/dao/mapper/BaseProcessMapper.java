package com.gome.arch.dao.mapper;

import com.gome.arch.dao.bean.BaseProcess;
import com.gome.arch.dao.bean.BaseProcessExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

@Mapper
public interface BaseProcessMapper extends Serializable {
    long countByExample(BaseProcessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseProcess record);

    int insertSelective(BaseProcess record);

    List<BaseProcess> selectByExample(BaseProcessExample example);

    BaseProcess selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseProcess record, @Param("example") BaseProcessExample example);

    int updateByExample(@Param("record") BaseProcess record, @Param("example") BaseProcessExample example);

    int updateByPrimaryKeySelective(BaseProcess record);

    int updateByPrimaryKey(BaseProcess record);
}