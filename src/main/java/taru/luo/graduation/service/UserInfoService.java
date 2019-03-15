package taru.luo.graduation.service;

import org.springframework.stereotype.Service;
import taru.luo.graduation.entity.UserInfo;

@Service
public interface UserInfoService {
    void add(UserInfo userInfo);

}
