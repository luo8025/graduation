package taru.luo.graduation.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taru.luo.graduation.entity.Product;
import taru.luo.graduation.entity.User;
import taru.luo.graduation.mapper.ProductMapper;
import taru.luo.graduation.mapper.UserMapper;
import taru.luo.graduation.vo.ProductVO;

import java.util.List;

@Service
public class ProductBiz {
    @Autowired
    ProductMapper productMapper;

    public void addProduct(Product product){
        productMapper.addProduct(product);
    }

    public void updateProduct(Product product){
        productMapper.updateProduct(product);
    }

    public void deleteProduct(String id){
        productMapper.deleteProduct(id);
    }

    public List<Product> selectAll(){
        return productMapper.selectAll();
    }

    public Product getProduct(String id){
        return productMapper.getProduct(id);
    }

    public List<Product> selectProductList(String id){
        return productMapper.selectProductList(id);
    }

    public List<Product> productDeleteList(String id){
        return productMapper.productDeleteList(id);
    }

    public List<ProductVO> selectAllBuy(){
        return productMapper.selectAllBuy();
    }

    public Product selectProductById(String id){
        return productMapper.selectProductById(id);
    }
}
