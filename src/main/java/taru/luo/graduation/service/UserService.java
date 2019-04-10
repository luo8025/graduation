package taru.luo.graduation.service;

import taru.luo.graduation.entity.User;

import java.util.List;


public interface UserService {

    User getUserInfoById(String id);

    List<User> selectAll();

    void insert(User user);


}
