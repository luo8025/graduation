package taru.luo.graduation.mapper;

import org.springframework.stereotype.Repository;
import taru.luo.graduation.entity.User;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UserMapper extends Mapper<User> {
}