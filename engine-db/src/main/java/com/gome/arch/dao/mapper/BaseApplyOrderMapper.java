package com.gome.arch.dao.mapper;

import com.gome.arch.dao.bean.BaseApplyOrder;
import com.gome.arch.dao.bean.BaseApplyOrderExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

@Mapper
public interface BaseApplyOrderMapper extends Serializable {
    long countByExample(BaseApplyOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseApplyOrder record);

    int insertSelective(BaseApplyOrder record);

    List<BaseApplyOrder> selectByExample(BaseApplyOrderExample example);

    BaseApplyOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseApplyOrder record, @Param("example") BaseApplyOrderExample example);

    int updateByExample(@Param("record") BaseApplyOrder record, @Param("example") BaseApplyOrderExample example);

    int updateByPrimaryKeySelective(BaseApplyOrder record);

    int updateByPrimaryKey(BaseApplyOrder record);
}