package taru.luo.graduation.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import taru.luo.graduation.common.BaseResult;
import taru.luo.graduation.entity.Order;
import taru.luo.graduation.entity.Product;
import taru.luo.graduation.service.OrderService;
import taru.luo.graduation.service.ProductService;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/add")
    public BaseResult insertOrder(Order order){
        BaseResult baseResult = new BaseResult();
        try{
            orderService.addOrder(order);
            baseResult.setStatus(HttpStatus.OK.value());
            baseResult.setMassage("success");
        }catch(Exception e){
            e.printStackTrace();
            baseResult.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            baseResult.setMassage(e.getMessage());
        }
        return  baseResult;
    }

    @GetMapping("/getMerchantOrder")
    public BaseResult getMerchantOrder(@RequestParam String id){
        BaseResult baseResult = new BaseResult();
        try{
            baseResult.setData(orderService.getMerchantOrder(id));
            baseResult.setStatus(HttpStatus.OK.value());
            baseResult.setMassage("success");
        }catch(Exception e){
            e.printStackTrace();
            baseResult.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            baseResult.setMassage(e.getMessage());
        }
        return  baseResult;
    }

    @GetMapping("/getOldOrder")
    public BaseResult getOldOrder(@RequestParam String id){
        BaseResult baseResult = new BaseResult();
        try{
            baseResult.setData(orderService.getOldOrder(id));
            baseResult.setStatus(HttpStatus.OK.value());
            baseResult.setMassage("success");
        }catch(Exception e){
            e.printStackTrace();
            baseResult.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            baseResult.setMassage(e.getMessage());
        }
        return  baseResult;
    }

    @GetMapping("/selectOrderByUserId")
    public BaseResult selectOrderByUserId(@RequestParam String id){
        BaseResult baseResult = new BaseResult();
        try{
            baseResult.setData(orderService.selectOrderByUserId(id));
            baseResult.setStatus(HttpStatus.OK.value());
            baseResult.setMassage("success");
        }catch(Exception e){
            e.printStackTrace();
            baseResult.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            baseResult.setMassage(e.getMessage());
        }
        return  baseResult;
    }

    @GetMapping("/selectOldOrderByUserId")
    public BaseResult selectOldOrderByUserId(@RequestParam String id){
        BaseResult baseResult = new BaseResult();
        try{
            baseResult.setData(orderService.selectOldOrderByUserId(id));
            baseResult.setStatus(HttpStatus.OK.value());
            baseResult.setMassage("success");
        }catch(Exception e){
            e.printStackTrace();
            baseResult.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            baseResult.setMassage(e.getMessage());
        }
        return  baseResult;
    }

    @GetMapping("/overOrder")
    public BaseResult overOrder(String id){
        BaseResult baseResult = new BaseResult();
        try{
            orderService.overOrder(id);
            baseResult.setStatus(HttpStatus.OK.value());
            baseResult.setMassage("success");
        }catch(Exception e){
            e.printStackTrace();
            baseResult.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            baseResult.setMassage(e.getMessage());
        }
        return  baseResult;
    }

    @GetMapping("/cancelOrder")
    public BaseResult cancelOrder(String id){
        BaseResult baseResult = new BaseResult();
        try{
            orderService.cancelOrder(id);
            baseResult.setStatus(HttpStatus.OK.value());
            baseResult.setMassage("success");
        }catch(Exception e){
            e.printStackTrace();
            baseResult.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            baseResult.setMassage(e.getMessage());
        }
        return  baseResult;
    }

    @GetMapping("/cancelOverOrder")
    public BaseResult cancelOverOrder(String id){
        BaseResult baseResult = new BaseResult();
        try{
            orderService.cancelOverOrder(id);
            baseResult.setStatus(HttpStatus.OK.value());
            baseResult.setMassage("success");
        }catch(Exception e){
            e.printStackTrace();
            baseResult.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            baseResult.setMassage(e.getMessage());
        }
        return  baseResult;
    }

    @GetMapping("/goOrder")
    public BaseResult goOrder(String id){
        BaseResult baseResult = new BaseResult();
        try{
            orderService.goOrder(id);
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
