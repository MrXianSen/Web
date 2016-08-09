package com.tingyi.web.dao;

import com.tingyi.web.model.MUser;

public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(MUser user);

    int insertSelective(MUser record);

    MUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MUser record);

    int updateByPrimaryKey(MUser record);
}