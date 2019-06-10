package taru.luo.graduation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @author gzb
 */

@SpringBootApplication
@MapperScan(value = "taru.luo.graduation.mapper")
public class GraduationApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraduationApplication.class, args);
    }

    @Configuration
    public class CorsConfig {
        @Bean
        public CorsFilter corsFilter() {
            final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
            final CorsConfiguration config = new CorsConfiguration();
            /**
             * 允许cookies跨域
             */
            config.setAllowCredentials(true);
            /**
             * #允许向该服务器提交请求的URI，*表示全部允许，在SpringMVC中，如果设成*，会自动转成当前请求头中的Origin
             */
            config.addAllowedOrigin("*");
            /**
             * #允许访问的头信息,*表示全部
             */
            config.addAllowedHeader("*");
            /**
             * 预检请求的缓存时间（秒），即在这个时间段里，对于相同的跨域请求不会再预检了
             */
            config.setMaxAge(18000L);
            /**
             * 允许提交请求的方法，*表示全部允许
             */
            config.addAllowedMethod("*");
            source.registerCorsConfiguration("/**", config);
            return new CorsFilter(source);
        }
    }


}