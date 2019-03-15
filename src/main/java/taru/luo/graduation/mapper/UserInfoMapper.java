package taru.luo.graduation.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import taru.luo.graduation.entity.UserInfo;
import taru.luo.graduation.mapper.base.BizMapper;

@Component
@Mapper
public interface UserInfoMapper extends BizMapper<UserInfo> {
}