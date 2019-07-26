package com.xjr.model;

public class StudentDO {
    private String id;

    private String name;

    private String kc;

    private Integer fs;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getKc() {
        return kc;
    }

    public void setKc(String kc) {
        this.kc = kc == null ? null : kc.trim();
    }

    public Integer getFs() {
        return fs;
    }

    public void setFs(Integer fs) {
        this.fs = fs;
    }
}