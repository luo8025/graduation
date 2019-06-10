package taru.luo.graduation.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import taru.luo.graduation.entity.Merchant;
import taru.luo.graduation.entity.Remind;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface RemindMapper extends Mapper<Remind> {

    void addRemind(Remind remind);

    List<Remind> remindList(@Param("id") String id);

    void updateStatus(@Param("id")String id);
}