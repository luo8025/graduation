package taru.luo.graduation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taru.luo.graduation.biz.OrderBiz;
import taru.luo.graduation.biz.RemindBiz;
import taru.luo.graduation.entity.Order;
import taru.luo.graduation.entity.Remind;
import taru.luo.graduation.service.OrderService;
import taru.luo.graduation.vo.OrderVO;
import taru.luo.graduation.vo.UserOrderVO;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderBiz OrderBiz;
    @Autowired
    private RemindBiz remindBiz;
    @Override
    public void addOrder(Order order) {
        Remind remind=new Remind();
        remind.setRemindId(order.getMerchant());
        remind.setRemindText("您的商品编号为:"+order.getProductId()+"的商品已被用户购买");
        remind.setProductId(order.getProductId());
        remind.setStatus("未读");
        remind.setDeleted("0");
        OrderBiz.insert(order);
        remindBiz.addRemind(remind);
    }

    @Override
    public List<OrderVO> getMerchantOrder(String id) {
        return OrderBiz.getMerchantOrder(id);
    }

    @Override
    public List<OrderVO> getOldOrder(String id) {
        return  OrderBiz.getOldOrder(id);
    }

    @Override
    public List<UserOrderVO> selectOrderByUserId(String id) {
        return OrderBiz.selectOrderByUserId(id);
    }

    @Override
    public List<UserOrderVO> selectOldOrderByUserId(String id) {
        return OrderBiz.selectOldOrderByUserId(id);
    }

    @Override
    public void overOrder(String id) {
        OrderBiz.overOrder(id);
    }

    @Override
    public void cancelOrder(String id) {
        OrderBiz.cancelOrder(id);
    }

    @Override
    public void cancelOverOrder(String id) {
        OrderBiz.cancelOverOrder(id);
    }

    @Override
    public void goOrder(String id) {
        OrderBiz.goOrder(id);
    }
}
