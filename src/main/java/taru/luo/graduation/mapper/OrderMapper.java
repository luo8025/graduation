package taru.luo.graduation.mapper;

import org.springframework.stereotype.Repository;
import taru.luo.graduation.entity.Order;
import tk.mybatis.mapper.common.Mapper;
@Repository
public interface OrderMapper extends Mapper<Order> {
}
