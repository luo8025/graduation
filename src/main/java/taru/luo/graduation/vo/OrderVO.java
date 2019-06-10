package taru.luo.graduation.vo;

import lombok.Data;

@Data
public class OrderVO {
    private String id;
    private String productName;
    private String count;
    private String price;
    private String total;
    private String username;
    private String time;
    private String status;
}
