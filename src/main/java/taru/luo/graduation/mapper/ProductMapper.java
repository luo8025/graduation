package taru.luo.graduation.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import taru.luo.graduation.entity.Product;
import taru.luo.graduation.vo.ProductVO;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface ProductMapper extends Mapper<Product> {
    public void addProduct (Product product);

    public void updateProduct (Product product);

    public void deleteProduct (@Param("id") String id);

    public List<Product> selectAll();

    public Product getProduct(@Param("id") String id);

    public  List<Product> selectProductList(@Param("id") String id);

    public  List<Product> productDeleteList(@Param("id") String id);

    List<ProductVO> selectAllBuy();

    Product selectProductById(@Param("id")String id);

}