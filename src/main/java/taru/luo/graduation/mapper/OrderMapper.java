package taru.luo.graduation.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import taru.luo.graduation.entity.Order;
import taru.luo.graduation.vo.OrderVO;
import taru.luo.graduation.vo.UserOrderVO;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface OrderMapper extends Mapper<Order> {
     void addOrder (Order order);

     List<OrderVO> getMerchantOrder(@Param("id")String id);

     List<OrderVO> getOldOrder(@Param("id")String id);

     List<UserOrderVO> selectOrderByUserId(@Param("id")String id);

     void overOrder(@Param("id")String id);

     void cancelOrder(@Param("id")String id);

     List<UserOrderVO> selectOldOrderByUserId(@Param("id")String id);

     void cancelOverOrder(@Param("id")String id);

     void goOrder(@Param("id")String id);


}
