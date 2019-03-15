package taru.luo.graduation.service;

import org.springframework.stereotype.Service;
import taru.luo.graduation.entity.Product;
import taru.luo.graduation.entity.UserInfo;

@Service
public interface ProductService {
    void insert(Product Product);

    void update(Product Product);

    void delete(Product Product);
}
