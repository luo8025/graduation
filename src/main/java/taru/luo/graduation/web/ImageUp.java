package taru.luo.graduation.web;



import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import taru.luo.graduation.common.BaseResult;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

@Controller
public class ImageUp {

//    上传图片
    @RequestMapping("/img/upload")
    @ResponseBody
    public BaseResult upload(@RequestParam("file") MultipartFile file)
    {
        BaseResult baseResult = new BaseResult();
        try {
            if (!file.isEmpty()){
                String oldFileName=file.getOriginalFilename();
                String newFileName= String.valueOf(System.currentTimeMillis())+oldFileName.substring(oldFileName.lastIndexOf("."));
                InputStream is=file.getInputStream();
                BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("E:\\img"+ File.separator+newFileName));
                byte [] bs=new  byte[1024];
                int len;
                while ((len=is.read(bs))!=-1){
                    bos.write(bs,0,len);
                }
                bos.flush();
                bos.close();
                System.out.println(newFileName);
                baseResult.setData(newFileName);
                baseResult.setStatus(HttpStatus.OK.value());
                baseResult.setMassage("success");
            }
        }catch (Exception e){
            baseResult.setStatus(HttpStatus.OK.value());
            baseResult.setMassage(e.getMessage());
        }
        return baseResult;
    }

}
