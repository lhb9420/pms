package com.dao;

import com.model.Leave;
import com.model.LeaveExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LeaveMapper {
    long countByExample(LeaveExample example);

    int deleteByExample(LeaveExample example);

    int deleteByPrimaryKey(Integer leaveId);

    int insert(Leave record);

    int insertSelective(Leave record);

    List<Leave> selectByExampleWithBLOBs(LeaveExample example);

    List<Leave> selectByExample(LeaveExample example);

    Leave selectByPrimaryKey(Integer leaveId);

    int updateByExampleSelective(@Param("record") Leave record, @Param("example") LeaveExample example);

    int updateByExampleWithBLOBs(@Param("record") Leave record, @Param("example") LeaveExample example);

    int updateByExample(@Param("record") Leave record, @Param("example") LeaveExample example);

    int updateByPrimaryKeySelective(Leave record);

    int updateByPrimaryKeyWithBLOBs(Leave record);

    int updateByPrimaryKey(Leave record);
}