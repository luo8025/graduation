package taru.luo.graduation.entity;

import lombok.Data;

@Data
public class Product {
    private String id;

    private String productName;

    private String photo;

    private String description;

    private String price;

    private String keyWord;

    private String createId;

    private String deleted;
}