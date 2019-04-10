package taru.luo.graduation.mapper;

import org.springframework.stereotype.Repository;
import taru.luo.graduation.entity.Product;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface ProductMapper extends Mapper<Product> {

}