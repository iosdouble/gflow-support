package com.gome.arch.dao.mapper;

import com.gome.arch.dao.bean.RtApprovalUser;
import com.gome.arch.dao.bean.RtApprovalUserExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;
@Mapper
public interface RtApprovalUserMapper extends Serializable {
    long countByExample(RtApprovalUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RtApprovalUser record);

    int insertSelective(RtApprovalUser record);

    List<RtApprovalUser> selectByExample(RtApprovalUserExample example);

    RtApprovalUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RtApprovalUser record, @Param("example") RtApprovalUserExample example);

    int updateByExample(@Param("record") RtApprovalUser record, @Param("example") RtApprovalUserExample example);

    int updateByPrimaryKeySelective(RtApprovalUser record);

    int updateByPrimaryKey(RtApprovalUser record);


    /**
     * 根据工单号获取审批规则
     * @param applyId
     * @return
     */
    @Deprecated
    public List<RtApprovalUser> getDealUserListByApplyId(Long applyId);
}