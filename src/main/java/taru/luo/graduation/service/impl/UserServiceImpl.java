package taru.luo.graduation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import taru.luo.graduation.biz.UserBiz;
import taru.luo.graduation.entity.User;
import taru.luo.graduation.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserBiz userBiz;

    @Override
    public User Login(String username, String password) {
        return userBiz.Login(username,password);
    }

    @Override
    public void updateUser(User user) {
        userBiz.updateUser(user);
    }

    @Override
    public void addUser(User user) {
        userBiz.addUser(user);
    }
}
