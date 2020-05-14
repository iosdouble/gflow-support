package com.gome.arch.dao.mapper;

import com.gome.arch.dao.bean.OptionLog;
import com.gome.arch.dao.bean.OptionLogExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;
@Mapper
public interface OptionLogMapper extends Serializable {
    long countByExample(OptionLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OptionLog record);

    int insertSelective(OptionLog record);

    List<OptionLog> selectByExampleWithBLOBs(OptionLogExample example);

    List<OptionLog> selectByExample(OptionLogExample example);

    OptionLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OptionLog record, @Param("example") OptionLogExample example);

    int updateByExampleWithBLOBs(@Param("record") OptionLog record, @Param("example") OptionLogExample example);

    int updateByExample(@Param("record") OptionLog record, @Param("example") OptionLogExample example);

    int updateByPrimaryKeySelective(OptionLog record);

    int updateByPrimaryKeyWithBLOBs(OptionLog record);

    int updateByPrimaryKey(OptionLog record);
}