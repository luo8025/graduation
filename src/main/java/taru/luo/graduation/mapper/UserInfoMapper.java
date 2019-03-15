package taru.luo.graduation.mapper;

import taru.luo.graduation.entity.UserInfo;
import taru.luo.graduation.mapper.base.BizMapper;

public interface UserInfoMapper extends BizMapper<UserInfo> {
    int insert(UserInfo record);

    int insertSelective(UserInfo record);
}