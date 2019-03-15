package taru.luo.graduation.mapper;

import taru.luo.graduation.entity.Login;
import taru.luo.graduation.mapper.base.BizMapper;

public interface LoginMapper extends BizMapper<Login> {
    int insert(Login record);

    int insertSelective(Login record);
}