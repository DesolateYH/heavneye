package com.hziee.heavneye.dao;


import com.hziee.heavneye.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
    //查询用户通过密码和姓名
    public User getByPasswordAndUsername(String username, String password);

}
