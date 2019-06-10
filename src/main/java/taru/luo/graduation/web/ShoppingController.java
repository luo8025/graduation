package taru.luo.graduation.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import taru.luo.graduation.common.BaseResult;
import taru.luo.graduation.entity.Product;
import taru.luo.graduation.entity.Shopping;
import taru.luo.graduation.service.ProductService;
import taru.luo.graduation.service.ShoppingService;

@RestController
@RequestMapping("/shopping")
public class ShoppingController {
    @Autowired
    private ShoppingService shoppingService;

    @PostMapping("/add")
    public BaseResult addShopping(Shopping shopping){
        BaseResult baseResult = new BaseResult();
        try{
            shoppingService.addShopping(shopping);
            baseResult.setStatus(HttpStatus.OK.value());
            baseResult.setMassage("success");
        }catch(Exception e){
            e.printStackTrace();
            baseResult.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            baseResult.setMassage(e.getMessage());
        }
        return  baseResult;
    }

    @GetMapping("/selectShoppingUserId")
    public BaseResult selectShoppingUserId(String id){
        BaseResult baseResult = new BaseResult();
        try{
            baseResult.setData(shoppingService.selectShoppingByUserId(id));
            baseResult.setStatus(HttpStatus.OK.value());
            baseResult.setMassage("success");
        }catch(Exception e){
            e.printStackTrace();
            baseResult.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            baseResult.setMassage(e.getMessage());
        }
        return  baseResult;
    }

    @PostMapping("/deleteShopping")
    public BaseResult deleteShopping(String id){
        BaseResult baseResult = new BaseResult();
        try{
            shoppingService.deleteShopping(id);
            baseResult.setStatus(HttpStatus.OK.value());
            baseResult.setMassage("success");
        }catch(Exception e){
            e.printStackTrace();
            baseResult.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            baseResult.setMassage(e.getMessage());
        }
        return  baseResult;
    }
}
