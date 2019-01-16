package com.qf.manager.dao;

import com.qf.manager.pojo.dto.PageRequest;
import com.qf.manager.pojo.po.MemberUser;

import java.util.List;

public interface MemberUserCustomMapper {

    List<MemberUser> listUsers(PageRequest pageRequest);

    Long countUsers(PageRequest pageRequest);
}
