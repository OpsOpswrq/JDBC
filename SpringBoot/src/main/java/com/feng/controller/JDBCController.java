package com.feng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class JDBCController {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @GetMapping("/getUsers")
    public List<Map<String, Object>> getUsers(){
        String sql = "select * from user";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        return maps;
    }
    @GetMapping("/addUser/{id}/{username}/{age}")
    public String addUser(@PathVariable("id")Integer id,@PathVariable("username")String name,@PathVariable("age") Integer age){
        String sql = "insert into user(id,name,age) values("+id+","+'"'+name+'"'+","+age+")";
        jdbcTemplate.update(sql);
        return "addUserOk";
    }
    @GetMapping("/updateUser/{id}/{username}/{age}")
    public String updateUser(@PathVariable("id")Integer id,@PathVariable("username")String name,@PathVariable("age") Integer age){
        String sql = "update user set name="+'"'+name+'"'+","+" age="+age+" where id="+id;
        jdbcTemplate.update(sql);
        return "updateUserOk";
    }
    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") Integer id){
        String sql = "delete from user where id=?";
        jdbcTemplate.update(sql,id);
        return "deleteOk";
    }
}
