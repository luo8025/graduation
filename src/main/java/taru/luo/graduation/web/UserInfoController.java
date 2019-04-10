package taru.luo.graduation.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import taru.luo.graduation.common.BaseResult;
import taru.luo.graduation.entity.User;
import taru.luo.graduation.service.UserService;

@RestController
@RequestMapping("/userinfo")
public class UserInfoController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public BaseResult selectAll(){
        BaseResult baseResult = new BaseResult();
        baseResult.setStatus(HttpStatus.OK.value());
        baseResult.setMassage("success");
        baseResult.setData(userService.selectAll());
        return  baseResult;
    }

    @PostMapping("/add")
    public BaseResult insertUserInfo(@RequestBody User user){
        BaseResult baseResult = new BaseResult();
        try{
            userService.insert(user);
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
