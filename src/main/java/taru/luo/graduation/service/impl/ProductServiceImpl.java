package taru.luo.graduation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taru.luo.graduation.biz.ProductBiz;
import taru.luo.graduation.entity.Product;
import taru.luo.graduation.service.ProductService;
import taru.luo.graduation.vo.ProductVO;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductBiz productBiz;
    @Override
    public void addProduct(Product product) {
        productBiz.addProduct(product);
    }

    @Override
    public void updateProduct(Product product) {
        productBiz.updateProduct(product);
    }

    @Override
    public void deleteProduct(String id) {
        productBiz.deleteProduct(id);
    }

    @Override
    public List<Product> selectAll() {
        return productBiz.selectAll();
    }

    @Override
    public Product getProduct(String id) {
        return productBiz.getProduct(id);
    }

    @Override
    public List<Product> selectProductList(String id) {
        return productBiz.selectProductList(id);
    }

    @Override
    public List<Product> productDeleteList(String id) {
        return productBiz.productDeleteList(id);
    }

    @Override
    public List<ProductVO> selectAllBuy() {
        return productBiz.selectAllBuy();
    }

    @Override
    public Product selectProductById(String id) {
        return productBiz.selectProductById(id);
    }
}
