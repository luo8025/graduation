package taru.luo.graduation.service;

import taru.luo.graduation.entity.User;

import java.util.List;


public interface UserService {

    User Login(String username,String password);

    void updateUser(User user);

    void addUser(User user);


}
