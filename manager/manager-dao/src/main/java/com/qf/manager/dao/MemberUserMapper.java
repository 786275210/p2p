package com.qf.manager.dao;

import com.qf.manager.pojo.po.MemberUser;
import com.qf.manager.pojo.po.MemberUserExample;
import com.qf.manager.pojo.po.MemberUserWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberUserMapper {
    int countByExample(MemberUserExample example);

    int deleteByExample(MemberUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberUserWithBLOBs record);

    int insertSelective(MemberUserWithBLOBs record);

    List<MemberUserWithBLOBs> selectByExampleWithBLOBs(MemberUserExample example);

    List<MemberUser> selectByExample(MemberUserExample example);

    MemberUserWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberUserWithBLOBs record, @Param("example") MemberUserExample example);

    int updateByExampleWithBLOBs(@Param("record") MemberUserWithBLOBs record, @Param("example") MemberUserExample example);

    int updateByExample(@Param("record") MemberUser record, @Param("example") MemberUserExample example);

    int updateByPrimaryKeySelective(MemberUserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MemberUserWithBLOBs record);

    int updateByPrimaryKey(MemberUser record);
}