package taru.luo.graduation.entity;

import lombok.Data;

@Data
public class Product {
    private String id;

    private String name;

    private String photo;

    private String describe;

    private String price;

    private String keyword;

    private String deleted;
}