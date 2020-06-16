package com.gome.arch.dao.mapper;

import com.gome.arch.dao.bean.RtApprovalDetail;
import com.gome.arch.dao.bean.RtApprovalDetailExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

@Mapper
public interface RtApprovalDetailMapper extends Serializable {
    long countByExample(RtApprovalDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RtApprovalDetail record);

    int insertSelective(RtApprovalDetail record);

    List<RtApprovalDetail> selectByExampleWithBLOBs(RtApprovalDetailExample example);

    List<RtApprovalDetail> selectByExample(RtApprovalDetailExample example);

    RtApprovalDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RtApprovalDetail record, @Param("example") RtApprovalDetailExample example);

    int updateByExampleWithBLOBs(@Param("record") RtApprovalDetail record, @Param("example") RtApprovalDetailExample example);

    int updateByExample(@Param("record") RtApprovalDetail record, @Param("example") RtApprovalDetailExample example);

    int updateByPrimaryKeySelective(RtApprovalDetail record);

    int updateByPrimaryKeyWithBLOBs(RtApprovalDetail record);

    int updateByPrimaryKey(RtApprovalDetail record);
}