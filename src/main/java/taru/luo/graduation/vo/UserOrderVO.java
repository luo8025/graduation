package taru.luo.graduation.vo;

import lombok.Data;

@Data
public class UserOrderVO {
    private String orderId;
    private String orderTotal;
    private String orderTime;
    private String orderStatus;
    private String productName;
}
