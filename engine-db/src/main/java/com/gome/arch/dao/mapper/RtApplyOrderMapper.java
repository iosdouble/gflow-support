package com.gome.arch.dao.mapper;

import com.gome.arch.dao.bean.RtApplyOrder;
import com.gome.arch.dao.bean.RtApplyOrderExample;
import com.gome.arch.dpo.ApprovalOrderPO;
import com.gome.arch.dpo.ApprovalOrderPOExt;
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


    /**
     * 自定义多表查询获取指定用户审批列表
     * @param userid
     * @return
     */
    List<ApprovalOrderPO> getApprovalListByUserId(Long userid);

    List<ApprovalOrderPOExt> getApprovalDetailListByUserId(Long userid);
}