package taru.luo.graduation.entity;

import lombok.Data;

@Data
public class Order {
    private String id;

    private String name;

    private String count;

    private String unit;

    private String total;

    private String time;

    private String deleted;
}
