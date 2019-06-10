package taru.luo.graduation.service;

import taru.luo.graduation.entity.Product;
import taru.luo.graduation.vo.ProductVO;

import java.util.List;


public interface ProductService {

    void addProduct(Product product);

    void updateProduct(Product product);

    void deleteProduct(String id);

    List<Product> selectAll();

    Product getProduct(String id);

    List<Product> selectProductList(String id);

    List<Product> productDeleteList(String id);

    List<ProductVO> selectAllBuy();

    Product selectProductById(String id);

}
