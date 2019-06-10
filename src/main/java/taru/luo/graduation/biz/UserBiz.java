package taru.luo.graduation.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taru.luo.graduation.entity.User;
import taru.luo.graduation.mapper.UserMapper;

import java.util.List;

@Service
public class UserBiz {
    @Autowired
    UserMapper userMapper;

    public User Login(String username,String password){
       return userMapper.Login(username,password);
    }

    public void updateUser(User user){
        userMapper.updateUser(user);
    }

    public void addUser(User user){
        userMapper.addUser(user);
    }

}
