package taru.luo.graduation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taru.luo.graduation.biz.MerchantBiz;
import taru.luo.graduation.entity.Merchant;
import taru.luo.graduation.service.MerchantService;

@Service
public class MerchantServiceImpl implements MerchantService {
    @Autowired
    MerchantBiz merchantBiz;
    @Override
    public Merchant Login(String username, String password) {
        return merchantBiz.Login(username,password);
    }

    @Override
    public void merchantMapper(Merchant merchant) {
        merchantBiz.updateMerchant(merchant);
    }

    @Override
    public void addMerchant(Merchant merchant) {
        merchantBiz.addMerchant(merchant);
    }
}
