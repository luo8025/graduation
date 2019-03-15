package taru.luo.graduation.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import taru.luo.graduation.entity.Product;
import taru.luo.graduation.mapper.base.BizMapper;

@Component
@Mapper
public interface ProductMapper extends BizMapper<Product> {
}