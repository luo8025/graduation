package taru.luo.graduation.service;


import taru.luo.graduation.entity.Merchant;

public interface MerchantService {

    Merchant Login(String username, String password);

    void merchantMapper(Merchant merchant);

    void addMerchant(Merchant merchant);
}
