package com.xjr.model;

import java.util.List;

public class ClassVo {
    private String id;

    private String classname;

    private String location;

    private List<StudentDO> studentDOS;

    private List<TeacherVO> teacherVOS;

    public List<TeacherVO> getTeacherVOS() {
        return teacherVOS;
    }

    public void setTeacherVOS(List<TeacherVO> teacherVOS) {
        this.teacherVOS = teacherVOS;
    }

    public List<StudentDO> getStudentDOS() {
        return studentDOS;
    }

    public void setStudentDOS(List<StudentDO> studentDOS) {
        this.studentDOS = studentDOS;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }
}