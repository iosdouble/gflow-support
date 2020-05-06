package com.gome.arch.dao.mapper;

import com.gome.arch.dao.bean.BaseNode;
import com.gome.arch.dao.bean.BaseNodeExample;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

public interface BaseNodeMapper extends Serializable {
    long countByExample(BaseNodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseNode record);

    int insertSelective(BaseNode record);

    List<BaseNode> selectByExample(BaseNodeExample example);

    BaseNode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseNode record, @Param("example") BaseNodeExample example);

    int updateByExample(@Param("record") BaseNode record, @Param("example") BaseNodeExample example);

    int updateByPrimaryKeySelective(BaseNode record);

    int updateByPrimaryKey(BaseNode record);
}