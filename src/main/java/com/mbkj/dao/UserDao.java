package com.mbkj.dao;

import com.mbkj.entity.User;

import java.util.List;

public interface UserDao {
    List<User> selectAll();
}
