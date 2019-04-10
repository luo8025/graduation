package taru.luo.graduation.common;

import lombok.Data;

@Data
public class BaseResult {
    private Integer status;
    private String massage;
    private Object Data;
}
