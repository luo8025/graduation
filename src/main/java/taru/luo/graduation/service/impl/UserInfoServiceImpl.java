package taru.luo.graduation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taru.luo.graduation.biz.UserInfoBiz;
import taru.luo.graduation.entity.UserInfo;
import taru.luo.graduation.service.UserInfoService;
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    UserInfoBiz userInfoBiz;

    @Override
    public void insert(UserInfo userInfo) {
        userInfoBiz.insert(userInfo);
    }

    @Override
    public void update(UserInfo userInfo) {
        userInfoBiz.updateByPrimaryKey(userInfo);
    }

    @Override
    public void delete(UserInfo userInfo) {
        userInfoBiz.deleteById(userInfo);
    }
}
