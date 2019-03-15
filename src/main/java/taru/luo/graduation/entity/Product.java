package taru.luo.graduation.entity;

import java.util.Date;

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

    public Product(String id, String productName, String productPhoto, String productPrice, String productUnit, String productCategory, Date createTime, String createId, String lastEditorId, Date lastEditorTime, String deletorId, Date deletorTime, String deleted) {
        this.id = id;
        this.productName = productName;
        this.productPhoto = productPhoto;
        this.productPrice = productPrice;
        this.productUnit = productUnit;
        this.productCategory = productCategory;
        this.createTime = createTime;
        this.createId = createId;
        this.lastEditorId = lastEditorId;
        this.lastEditorTime = lastEditorTime;
        this.deletorId = deletorId;
        this.deletorTime = deletorTime;
        this.deleted = deleted;
    }

    public String getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductPhoto() {
        return productPhoto;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public String getCreateId() {
        return createId;
    }

    public String getLastEditorId() {
        return lastEditorId;
    }

    public Date getLastEditorTime() {
        return lastEditorTime;
    }

    public String getDeletorId() {
        return deletorId;
    }

    public Date getDeletorTime() {
        return deletorTime;
    }

    public String getDeleted() {
        return deleted;
    }
}