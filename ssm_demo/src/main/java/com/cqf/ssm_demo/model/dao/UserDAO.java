package com.cqf.ssm_demo.model.dao;

import com.cqf.ssm_demo.model.bean.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDAO {

    /**
     * 查找
     * @param name
     * @param password
     * @return
     */
    User find(@Param("name") String name, @Param("password") String password);
}