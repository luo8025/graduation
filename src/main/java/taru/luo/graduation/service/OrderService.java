package taru.luo.graduation.service;


import taru.luo.graduation.entity.Order;
import taru.luo.graduation.vo.OrderVO;
import taru.luo.graduation.vo.UserOrderVO;

import java.util.List;

public interface OrderService {

    void addOrder(Order order);

    List<OrderVO> getMerchantOrder(String id);

    List<OrderVO> getOldOrder(String id);

    List<UserOrderVO> selectOrderByUserId(String id);

    List<UserOrderVO> selectOldOrderByUserId(String id);

    void overOrder(String id);

    void cancelOrder(String id);

    void cancelOverOrder(String id);

    void goOrder(String id);
}
