package taru.luo.graduation.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import taru.luo.graduation.entity.Login;
import taru.luo.graduation.mapper.base.BizMapper;

@Component
@Mapper
public interface LoginMapper extends BizMapper<Login> {
}