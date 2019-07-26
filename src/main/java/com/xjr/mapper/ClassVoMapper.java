package com.xjr.mapper;

import com.xjr.model.ClassVo;

import java.util.List;

public interface ClassVoMapper {
    int deleteByPrimaryKey(String id);

    int insert(ClassVo record);

    int insertSelective(ClassVo record);

    ClassVo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ClassVo record);

    int updateByPrimaryKey(ClassVo record);

    List getStudents();
    ClassVo getTeachers(String id);
}