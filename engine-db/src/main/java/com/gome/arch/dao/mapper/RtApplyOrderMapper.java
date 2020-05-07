package com.gome.arch.dao.mapper;

import com.gome.arch.dao.bean.RtApplyOrder;
import com.gome.arch.dao.bean.RtApplyOrderExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

@Mapper
public interface RtApplyOrderMapper extends Serializable {
    long countByExample(RtApplyOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RtApplyOrder record);

    int insertSelective(RtApplyOrder record);

    List<RtApplyOrder> selectByExample(RtApplyOrderExample example);

    RtApplyOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RtApplyOrder record, @Param("example") RtApplyOrderExample example);

    int updateByExample(@Param("record") RtApplyOrder record, @Param("example") RtApplyOrderExample example);

    int updateByPrimaryKeySelective(RtApplyOrder record);

    int updateByPrimaryKey(RtApplyOrder record);
}