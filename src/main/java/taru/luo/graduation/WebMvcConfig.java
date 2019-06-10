package taru.luo.graduation;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {


    /**
     * 这个方法是用来配置静态资源的，比如html，js，css，等等=
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        /**
         * 文件磁盘图片url 映射E:/user-img
         *配置server虚拟路径，handler为前台访问的目录，locations为files相对应的本地路径  file:G:/upload/image/
         */
        registry.addResourceHandler("/image/**").addResourceLocations("file:/");
        registry.addResourceHandler("/image/**").addResourceLocations("file:E:/image-BookCity/");
        registry.addResourceHandler("/img/**").addResourceLocations("file:E:/apple/");
        registry.addResourceHandler("/image/**").addResourceLocations("file:E:/img/");
    }

}
