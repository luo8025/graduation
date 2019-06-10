package taru.luo.graduation.service;


import taru.luo.graduation.entity.Shopping;
import taru.luo.graduation.vo.ShoppingVO;

import java.util.List;

public interface ShoppingService {

    void addShopping(Shopping shopping);

    List<ShoppingVO> selectShoppingByUserId(String id);

    void deleteShopping(String id);
}
