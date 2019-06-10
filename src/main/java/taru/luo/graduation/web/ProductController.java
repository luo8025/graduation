package taru.luo.graduation.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import taru.luo.graduation.common.BaseResult;
import taru.luo.graduation.entity.Product;
import taru.luo.graduation.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

//    @GetMapping("/all")
//    public BaseResult selectAll(){
//        BaseResult baseResult = new BaseResult();
//        baseResult.setStatus(HttpStatus.OK.value());
//        baseResult.setMassage("success");
//        baseResult.setData(userService.selectAll());
//        return  baseResult;
//    }

//    @RequestParam String id,
//    @RequestParam String productName,
//    @RequestParam String photo,
//    @RequestParam String description,
//    @RequestParam String price,
//    @RequestParam String keyWord,
//    @RequestParam String crated,
//    @RequestParam String deleted
    @PostMapping("/add")
    public BaseResult insertProduct(Product product){
        BaseResult baseResult = new BaseResult();
        try{
            productService.addProduct(product);
            baseResult.setStatus(HttpStatus.OK.value());
            baseResult.setMassage("success");
        }catch(Exception e){
            e.printStackTrace();
            baseResult.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            baseResult.setMassage(e.getMessage());
        }
        return  baseResult;
    }

    @PostMapping("/update")
    public BaseResult updateProduct(@RequestBody Product product){
        BaseResult baseResult = new BaseResult();
        try{
            productService.updateProduct(product);
            baseResult.setStatus(HttpStatus.OK.value());
            baseResult.setMassage("success");
        }catch(Exception e){
            e.printStackTrace();
            baseResult.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            baseResult.setMassage(e.getMessage());
        }
        return  baseResult;
    }

    @GetMapping("/delete")
    public BaseResult deleteProduct(@RequestParam String id){
        BaseResult baseResult = new BaseResult();
        try{
            productService.deleteProduct(id);
            baseResult.setStatus(HttpStatus.OK.value());
            baseResult.setMassage("success");
        }catch(Exception e){
            e.printStackTrace();
            baseResult.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            baseResult.setMassage(e.getMessage());
        }
        return  baseResult;
    }

    @GetMapping("/all")
    public BaseResult selectAll(){
        BaseResult baseResult = new BaseResult();
        try{
            baseResult.setData(productService.selectAll());
            baseResult.setStatus(HttpStatus.OK.value());
            baseResult.setMassage("success");
        }catch(Exception e){
            e.printStackTrace();
            baseResult.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            baseResult.setMassage(e.getMessage());
        }
        return  baseResult;
    }

    @PostMapping("/getProduct")
    public BaseResult getProduct(@RequestParam String id){
        BaseResult baseResult = new BaseResult();
        try{
            baseResult.setData(productService.getProduct(id));
            baseResult.setStatus(HttpStatus.OK.value());
            baseResult.setMassage("success");
        }catch(Exception e){
            e.printStackTrace();
            baseResult.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            baseResult.setMassage(e.getMessage());
        }
        return  baseResult;
    }

    @PostMapping("/getProductList")
    public BaseResult getProductList(@RequestParam String id){
        BaseResult baseResult = new BaseResult();
        try{
            baseResult.setData(productService.selectProductList(id));
            baseResult.setStatus(HttpStatus.OK.value());
            baseResult.setMassage("success");
        }catch(Exception e){
            e.printStackTrace();
            baseResult.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            baseResult.setMassage(e.getMessage());
        }
        return  baseResult;
    }

    @PostMapping("/getDeleteProductList")
    public BaseResult getDeleteProductList(@RequestParam String id){
        BaseResult baseResult = new BaseResult();
        try{
            baseResult.setData(productService.productDeleteList(id));
            baseResult.setStatus(HttpStatus.OK.value());
            baseResult.setMassage("success");
        }catch(Exception e){
            e.printStackTrace();
            baseResult.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            baseResult.setMassage(e.getMessage());
        }
        return  baseResult;
    }

    @GetMapping("/selectAllBuy")
    public BaseResult selectAllBuy(){
        BaseResult baseResult = new BaseResult();
        try{
            baseResult.setData(productService.selectAllBuy());
            baseResult.setStatus(HttpStatus.OK.value());
            baseResult.setMassage("success");
        }catch(Exception e){
            e.printStackTrace();
            baseResult.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            baseResult.setMassage(e.getMessage());
        }
        return  baseResult;
    }

    @GetMapping("/selectProductById")
    public BaseResult selectProductById(@RequestParam String id){
        BaseResult baseResult = new BaseResult();
        try{
            baseResult.setData(productService.selectProductById(id));
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
