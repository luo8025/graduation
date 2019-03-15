package taru.luo.graduation.mapper;

import taru.luo.graduation.entity.Product;
import taru.luo.graduation.mapper.base.BizMapper;

public interface ProductMapper extends BizMapper<Product> {
    int insert(Product record);

    int insertSelective(Product record);
}