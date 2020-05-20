package com.gome.arch.dao.mapper;

import com.gome.arch.dao.bean.HiApprovalUserFlow;
import com.gome.arch.dao.bean.HiApprovalUserFlowExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;
@Mapper
public interface HiApprovalUserFlowMapper extends Serializable {
    long countByExample(HiApprovalUserFlowExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiApprovalUserFlow record);

    int insertSelective(HiApprovalUserFlow record);

    List<HiApprovalUserFlow> selectByExample(HiApprovalUserFlowExample example);

    HiApprovalUserFlow selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiApprovalUserFlow record, @Param("example") HiApprovalUserFlowExample example);

    int updateByExample(@Param("record") HiApprovalUserFlow record, @Param("example") HiApprovalUserFlowExample example);

    int updateByPrimaryKeySelective(HiApprovalUserFlow record);

    int updateByPrimaryKey(HiApprovalUserFlow record);
}