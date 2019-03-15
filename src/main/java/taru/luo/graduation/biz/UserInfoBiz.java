package taru.luo.graduation.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taru.luo.graduation.biz.base.BaseBiz;
import taru.luo.graduation.entity.UserInfo;
import taru.luo.graduation.mapper.UserInfoMapper;

@Service
public class UserInfoBiz extends BaseBiz<UserInfoMapper,UserInfo> {
    @Autowired
    UserInfoMapper userInfoMapper;

}
