package com.hziee.heavneye.service;

import com.hziee.heavneye.model.dto.User;
import com.hziee.heavneye.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by john on 2017-10-01.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Iterable<User> getAll(){
        Iterable<User> userList = userRepository.findAll();
        return userList;
    }

/*    public User findByIdUser(Integer id){
        User user = userRepository.findOne(id);
        return user;
    }*/

    public User addUser(User user){
        User user1 = userRepository.save(user);
        return user1;
    }
  /*  public void deleteUser(Integer id){
        userRepository.delete(id);
    }*/

}