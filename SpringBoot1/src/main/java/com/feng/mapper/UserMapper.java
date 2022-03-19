package com.feng.mapper;

import com.feng.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserMapper {
    List<User> getAllUsers();
    User getUser(int id);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
}
