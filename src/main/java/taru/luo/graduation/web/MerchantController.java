package taru.luo.graduation.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taru.luo.graduation.common.BaseResult;
import taru.luo.graduation.entity.Merchant;
import taru.luo.graduation.entity.User;
import taru.luo.graduation.service.MerchantService;
import taru.luo.graduation.service.UserService;

@RestController
@RequestMapping("/merchant")
public class MerchantController {
    @Autowired
    private MerchantService merchantService;

    @PostMapping("/login")
    public BaseResult login(@RequestParam String username,
                            @RequestParam String password,
                            @RequestParam String checkCode){
        BaseResult baseResult = new BaseResult();
        try{
            String yzm=CheckController.checkCode;
            System.out.println(yzm);
            yzm=yzm.toLowerCase();
            checkCode=checkCode.toLowerCase();
            if(!yzm.equals(checkCode)){
                baseResult.setMassage("验证码不正确");
            }
            Merchant merchant=merchantService.Login(username,password);
            if(merchant!=null){
                baseResult.setData(merchant);
                baseResult.setStatus(HttpStatus.OK.value());
                baseResult.setMassage("success");
            }else {
                baseResult.setStatus(400);
                baseResult.setMassage("账号或密码出错");
            }
        }catch(Exception e){
            e.printStackTrace();
            baseResult.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            baseResult.setMassage(e.getMessage());
        }
        return baseResult;
    }

    private static String CheckValueOf(Object object) {
        return (object==null)?null:object.toString();
    }


    @PostMapping("/updateMerchant")
    public BaseResult updateMerchant(Merchant merchant){
        BaseResult baseResult = new BaseResult();
        try{
            merchantService.merchantMapper(merchant);
            baseResult.setStatus(HttpStatus.OK.value());
            baseResult.setMassage("success");
        }catch(Exception e){
            e.printStackTrace();
            baseResult.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            baseResult.setMassage(e.getMessage());
        }
        return  baseResult;
    }

    @PostMapping("/addMerchant")
    public BaseResult addMerchant(Merchant merchant){
        BaseResult baseResult = new BaseResult();
        try{
            merchantService.addMerchant(merchant);
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
