package taru.luo.graduation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taru.luo.graduation.biz.RemindBiz;
import taru.luo.graduation.biz.ShoppingBiz;
import taru.luo.graduation.entity.Remind;
import taru.luo.graduation.entity.Shopping;
import taru.luo.graduation.service.ShoppingService;
import taru.luo.graduation.vo.ShoppingVO;

import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingService {
    @Autowired
    ShoppingBiz shoppingBiz;
    @Autowired
    RemindBiz remindBiz;
    @Override
    public void addShopping(Shopping shopping) {
        Remind remind=new Remind();
        remind.setRemindId(shopping.getUserId());
        remind.setRemindText("您的商品编号为:"+shopping.getProductId()+"的商品已被用户添加购物车");
        remind.setProductId(shopping.getProductId());
        remind.setStatus("未读");
        remind.setDeleted("0");
        shoppingBiz.addShopping(shopping);
        remindBiz.addRemind(remind);
    }

    @Override
    public List<ShoppingVO> selectShoppingByUserId(String id) {
        return shoppingBiz.selectShoppingByUserId(id);
    }

    @Override
    public void deleteShopping(String id) {
        shoppingBiz.deleteShopping(id);
    }
}
