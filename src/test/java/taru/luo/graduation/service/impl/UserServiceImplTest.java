package taru.luo.graduation.service.impl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import taru.luo.graduation.entity.User;
import taru.luo.graduation.service.UserService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {
    @Autowired
    UserService UserService;

    @Test
    public void getUserInfoById() {
    }

    @Test
    public void selectAll() {
        List<User> list = UserService.selectAll();
        Assert.assertNotNull(list);
    }
}