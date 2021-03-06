package taru.luo.graduation.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import taru.luo.graduation.entity.User;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UserMapper extends Mapper<User> {

    User Login(@Param("username")String username,
               @Param("password")String password);

    void updateUser (User user);

    void addUser(User user);
}