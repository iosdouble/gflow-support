package com.gome.arch.dao.mapper;

import com.gome.arch.dao.bean.RtApplyOrderDetail;
import com.gome.arch.dao.bean.RtApplyOrderDetailExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;
@Mapper
public interface RtApplyOrderDetailMapper extends Serializable {
    long countByExample(RtApplyOrderDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RtApplyOrderDetail record);

    int insertSelective(RtApplyOrderDetail record);

    List<RtApplyOrderDetail> selectByExampleWithBLOBs(RtApplyOrderDetailExample example);

    List<RtApplyOrderDetail> selectByExample(RtApplyOrderDetailExample example);

    RtApplyOrderDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RtApplyOrderDetail record, @Param("example") RtApplyOrderDetailExample example);

    int updateByExampleWithBLOBs(@Param("record") RtApplyOrderDetail record, @Param("example") RtApplyOrderDetailExample example);

    int updateByExample(@Param("record") RtApplyOrderDetail record, @Param("example") RtApplyOrderDetailExample example);

    int updateByPrimaryKeySelective(RtApplyOrderDetail record);

    int updateByPrimaryKeyWithBLOBs(RtApplyOrderDetail record);

    int updateByPrimaryKey(RtApplyOrderDetail record);
}