package com.gome.arch.dao.mapper;

import com.gome.arch.dao.bean.BaseProcessNode;
import com.gome.arch.dao.bean.BaseProcessNodeExample;
import com.gome.arch.dpo.ProcessPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;
@Mapper
public interface BaseProcessNodeMapper extends Serializable {
    long countByExample(BaseProcessNodeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseProcessNode record);

    int insertSelective(BaseProcessNode record);

    List<BaseProcessNode> selectByExample(BaseProcessNodeExample example);

    BaseProcessNode selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseProcessNode record, @Param("example") BaseProcessNodeExample example);

    int updateByExample(@Param("record") BaseProcessNode record, @Param("example") BaseProcessNodeExample example);

    int updateByPrimaryKeySelective(BaseProcessNode record);

    int updateByPrimaryKey(BaseProcessNode record);


    /**
     * 自扩展方法
     * @param processId
     * @return
     */
    List<ProcessPO> getProcessById(Long processId);

    List<ProcessPO> getProcess();

}