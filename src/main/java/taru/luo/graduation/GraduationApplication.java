package taru.luo.graduation;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.HashMap;

@SpringBootApplication
@MapperScan(basePackages = "taru.luo.graduation.mapper")

public class  GraduationApplication {
    public static void main(String[] args) {
        SpringApplication.run(GraduationApplication.class, args);
    }
}