package taru.luo.graduation.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import taru.luo.graduation.entity.Merchant;
import taru.luo.graduation.entity.User;
import tk.mybatis.mapper.common.Mapper;
@Repository
public interface MerchantMapper extends Mapper<Merchant> {
    Merchant Login(@Param("username")String username,
               @Param("password")String password);

    void updateMerchant(Merchant merchant);

    void addMerchant(Merchant merchant);
}