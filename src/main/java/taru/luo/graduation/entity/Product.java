package taru.luo.graduation.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Product {
    private String id;

    private String productName;

    private String productPhoto;

    private String productPrice;

    private String productUnit;

    private String productCategory;

    private Date createTime;

    private String createId;

    private String lastEditorId;

    private Date lastEditorTime;

    private String deletorId;

    private Date deletorTime;

    private String deleted;
}