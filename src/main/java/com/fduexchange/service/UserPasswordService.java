package com.fduexchange.service;

import com.fduexchange.pojo.UserPassword;

public interface UserPasswordService {
    int deleteByPrimaryKey(Integer id);

    int insert(UserPassword record);

    int insertSelective(UserPassword record);

    UserPassword selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserPassword record);

    int updateByPrimaryKey(UserPassword record);

    UserPassword selectByUid(Integer uid);
}
