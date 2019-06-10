package taru.luo.graduation.service.impl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import taru.luo.graduation.vo.OrderVO;
import taru.luo.graduation.vo.UserOrderVO;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceImplTest {
    @Autowired
    OrderServiceImpl orderServiceImpl;

    @Test
    public void getMerchantOrder() {
        String id="1";
        List<OrderVO> list=orderServiceImpl.getMerchantOrder(id);
        Assert.assertNotNull(list);
    }

    @Test
    public void getOldOrder() {
        String id="1";
        List<OrderVO> list=orderServiceImpl.getOldOrder(id);
        Assert.assertNotNull(list);
    }

    @Test
    public void selectOrderByUserId() {
        String id="1";
        List<UserOrderVO> list=orderServiceImpl.selectOrderByUserId(id);
        Assert.assertNotNull(list);
    }

    @Test
    public void selectOldOrderByUserId() {
    }
}