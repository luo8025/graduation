package taru.luo.graduation.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taru.luo.graduation.entity.Shopping;
import taru.luo.graduation.entity.User;
import taru.luo.graduation.mapper.ShoppingMapper;
import taru.luo.graduation.mapper.UserMapper;
import taru.luo.graduation.vo.ShoppingVO;

import java.util.List;

@Service
public class ShoppingBiz {
    @Autowired
    private ShoppingMapper shoppingMapper;

    public void addShopping(Shopping shopping){
        shoppingMapper.addShopping(shopping);
    }

    public List<ShoppingVO> selectShoppingByUserId(String id){
        return shoppingMapper.selectShoppingByUserId(id);
    }

    public void deleteShopping(String id){
        shoppingMapper.deleteShopping(id);
    }

}
