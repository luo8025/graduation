package taru.luo.graduation.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taru.luo.graduation.entity.User;
import taru.luo.graduation.mapper.UserMapper;

import java.util.List;

@Service
public class LoginBiz {
    @Autowired
    UserMapper userMapper;

    public void insert(User user){
        userMapper.insertSelective(user);
    }

    public User getUserInfoById(String id){
        return userMapper.selectByPrimaryKey(id);
    }


    public List<User> selectAll(){
        return userMapper.selectAll();
    }

}
