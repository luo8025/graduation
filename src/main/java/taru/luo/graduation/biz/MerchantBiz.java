package taru.luo.graduation.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taru.luo.graduation.entity.Merchant;
import taru.luo.graduation.entity.User;
import taru.luo.graduation.mapper.MerchantMapper;
import taru.luo.graduation.mapper.UserMapper;

import java.util.List;

@Service
public class MerchantBiz {
    @Autowired
    MerchantMapper merchantMapper;

    public Merchant Login(String username, String password){
        return merchantMapper.Login(username,password);
    }

    public void updateMerchant(Merchant merchant){
        merchantMapper.updateMerchant(merchant);
    }

    public void addMerchant(Merchant merchant){
        merchantMapper.addMerchant(merchant);
    }

}
