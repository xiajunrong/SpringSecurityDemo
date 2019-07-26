package com.xjr.mapper;

import com.xjr.model.StudentDO;

import java.util.List;

public interface StudentDOMapper {
    int deleteByPrimaryKey(String id);

    int insert(StudentDO record);

    int insertSelective(StudentDO record);

    StudentDO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(StudentDO record);

    int updateByPrimaryKey(StudentDO record);

    List  getStuentList();
}