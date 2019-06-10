package taru.luo.graduation.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import taru.luo.graduation.common.BaseResult;
import taru.luo.graduation.entity.Shopping;
import taru.luo.graduation.service.RemindService;
import taru.luo.graduation.service.ShoppingService;

@RestController
@RequestMapping("/remind")
public class RemindController {
    @Autowired
    private RemindService remindService;

    @GetMapping("/remindList")
    public BaseResult remindList(String id){
        BaseResult baseResult = new BaseResult();
        try{
            baseResult.setData(remindService.remindList(id));
            baseResult.setStatus(HttpStatus.OK.value());
            baseResult.setMassage("success");
        }catch(Exception e){
            e.printStackTrace();
            baseResult.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            baseResult.setMassage(e.getMessage());
        }
        return  baseResult;
    }

    @GetMapping("/updateStatus")
    public BaseResult updateStatus(String id){
        BaseResult baseResult = new BaseResult();
        try{
            remindService.updateStatus(id);
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
