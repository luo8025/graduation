package taru.luo.graduation.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taru.luo.graduation.entity.Order;
import taru.luo.graduation.mapper.OrderMapper;
import taru.luo.graduation.vo.OrderVO;
import taru.luo.graduation.vo.UserOrderVO;

import java.util.List;

@Service
public class OrderBiz {
    @Autowired
    OrderMapper orderMapper;

    public void insert(Order order){
        orderMapper.addOrder(order);
    }

    public List<OrderVO> getMerchantOrder(String id){
        return orderMapper.getMerchantOrder(id);
    }
    public List<OrderVO> getOldOrder(String id){
        return orderMapper.getOldOrder(id);
    }

    public List<UserOrderVO>selectOrderByUserId(String id){
        return orderMapper.selectOrderByUserId(id);
    }

    public List<UserOrderVO>selectOldOrderByUserId(String id){
        return orderMapper.selectOldOrderByUserId(id);
    }


    public void overOrder(String id){
        orderMapper.overOrder(id);
    }

    public void cancelOrder(String id){
        orderMapper.cancelOrder(id);
    }

    public void cancelOverOrder(String id){
        orderMapper.cancelOverOrder(id);
    }

    public void goOrder(String id){
        orderMapper.goOrder(id);
    }



}
