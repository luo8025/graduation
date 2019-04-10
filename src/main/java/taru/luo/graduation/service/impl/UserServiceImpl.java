package taru.luo.graduation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taru.luo.graduation.biz.UserInfoBiz;
import taru.luo.graduation.entity.User;
import taru.luo.graduation.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserInfoBiz userInfoBiz;

    @Override
    public User getUserInfoById(String id) {
        return userInfoBiz.getUserInfoById(id);
    }

    @Override
    public List<User> selectAll() {
        return userInfoBiz.selectAll();
    }

    @Override
    public void insert(User user) {
        userInfoBiz.insert(user);
    }
}
