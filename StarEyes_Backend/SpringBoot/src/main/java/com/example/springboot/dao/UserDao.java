package com.example.springboot.dao;

import com.example.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {
    List<User> findAll();

    User getByID(Integer id);

    User checkByID(@Param("id") String id, @Param("password")String password);

    //insert 只会返回int
    void insert(User user);

    void update(User user);

    Integer delete(Integer id);
}