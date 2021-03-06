package taru.luo.graduation.entity;

import lombok.Data;

@Data
public class Order {
    private String id;

    private String productId;

    private String count;

    private String price;

    private String total;

    private String time;

    private String buyUser;

    private String merchant;

    private String status;

    private String deleted;
}
