package taru.luo.graduation.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import taru.luo.graduation.common.BaseResult;
import taru.luo.graduation.entity.User;
import taru.luo.graduation.service.UserService;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private CheckController checkController;

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
            User user=userService.Login(username,password);
            if(user!=null){
                baseResult.setData(user);
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

    @PostMapping("/updateUser")
    public BaseResult updateUser(User user){
        BaseResult baseResult = new BaseResult();
        try{
            userService.updateUser(user);
            baseResult.setStatus(HttpStatus.OK.value());
            baseResult.setMassage("success");
        }catch(Exception e){
            e.printStackTrace();
            baseResult.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            baseResult.setMassage(e.getMessage());
        }
        return  baseResult;
    }

    @PostMapping("/addUser")
    public BaseResult addUser(User user){
        BaseResult baseResult = new BaseResult();
        try{
            userService.addUser(user);
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
