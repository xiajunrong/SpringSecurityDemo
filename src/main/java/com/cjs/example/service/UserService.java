package com.cjs.example.service;

import com.cjs.example.entity.SysUser;

public interface UserService {

    /**
     * 根据用户名获取系统用户
     */
    SysUser getUserByName(String username);

}
