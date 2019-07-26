package com.xjr.mapper;

import com.xjr.model.TeacherVO;

public interface TeacherVOMapper {
    int deleteByPrimaryKey(String id);

    int insert(TeacherVO record);

    int insertSelective(TeacherVO record);

    TeacherVO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TeacherVO record);

    int updateByPrimaryKey(TeacherVO record);
}